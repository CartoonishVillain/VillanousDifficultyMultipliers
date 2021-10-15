package com.cartoonishvillain.vdm.Commands;

import com.cartoonishvillain.vdm.VDM;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.impl.TimeCommand;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.UUID;

public class ActivateMultiplierCommand {
    public static void register(CommandDispatcher<CommandSource> source) {
        source.register(Commands.literal("vdm")
                .then(Commands.literal("activate").requires(requirement -> {
                    return requirement.hasPermission(2);
                }).then(Commands.literal("anger").executes(context -> {
                    return activate(context.getSource(), "anger");
                })).then(Commands.literal("blackeye").executes(context -> {
                    return activate(context.getSource(), "blackeye");
                })).then(Commands.literal("cannon").executes(context -> {
                    return activate(context.getSource(), "cannon");
                })).then(Commands.literal("venom").executes(context -> {
                    return activate(context.getSource(), "venom");
                })).then(Commands.literal("shift").executes(context -> {
                    return activate(context.getSource(), "shift");
                })).then(Commands.literal("karmicjustice").executes(context -> {
                    return activate(context.getSource(), "karmicjustice");
                })).then(Commands.literal("aging").executes(context -> {
                    return activate(context.getSource(), "aging");
                })).then(Commands.literal("softskin").executes(context -> {
                    return activate(context.getSource(), "softskin");
                })).then(Commands.literal("fatigue").executes(context -> {
                    return activate(context.getSource(), "fatigue");
                })).then(Commands.literal("hardened").executes(context -> {
                    return activate(context.getSource(), "hardened");
                })).then(Commands.literal("hardened").executes(context -> {
                    return activate(context.getSource(), "hardened");
                })).then(Commands.literal("unstable").executes(context -> {
                    return activate(context.getSource(), "unstable");
                })).then(Commands.literal("kinetic").executes(context -> {
                    return activate(context.getSource(), "kinetic");
                })).then(Commands.literal("undying").executes(context -> {
                    return activate(context.getSource(), "undying");
                })).then(Commands.literal("fuelefficient").executes(context -> {
                    return activate(context.getSource(), "fuelefficient");
                })).then(Commands.literal("blacksmithing").executes(context -> {
                    return activate(context.getSource(), "blacksmithing");
                })).then(Commands.literal("warranty").executes(context -> {
                    return activate(context.getSource(), "warranty");
                })).then(Commands.literal("flammable").executes(context -> {
                    return activate(context.getSource(), "flammable");
                })).then(Commands.literal("vegetarian").executes(context -> {
                    return activate(context.getSource(), "vegetarian");
                })).then(Commands.literal("wrong").executes(context -> {
                    return activate(context.getSource(), "wrong");
                })).then(Commands.literal("pandemic").executes(context -> {
                    return activate(context.getSource(), "pandemic");
                })).then(Commands.literal("wild").executes(context -> {
                    return activate(context.getSource(), "wild");
                })).then(Commands.literal("rested").executes(context -> {
                    return activate(context.getSource(), "rested");
                })).then(Commands.literal("celebration").executes(context -> {
                    return activate(context.getSource(), "celebration");
                })).then(Commands.literal("heroic").executes(context -> {
                    return activate(context.getSource(), "heroic");
                })).then(Commands.literal("keystothecity").executes(context -> {
                    return activate(context.getSource(), "keystothecity");
                }))));
    }


    private static int activate(CommandSource context, String string){
        switch (string){
            case "blackeye":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.blackeye"));
                VDM.config.BLACKEYE.set(true);
                break;
            case "cannon":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.cannon"));
                VDM.config.CANNON.set(true);
                break;
            case "venom":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.venom"));
                VDM.config.VENOM.set(true);
                break;
            case "shift":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.shift"));
                VDM.config.SHIFT.set(true);
                break;
            case "karmicjustice":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.karmicjustice"));
                VDM.config.KARMICJUSTICE.set(true);
                break;
            case "aging":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.aging"));
                VDM.config.AGING.set(true);
                break;
            case "softskin":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.softskin"));
                VDM.config.SOFTSKIN.set(true);
                break;
            case "fatigue":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.fatigue"));
                VDM.config.FATIGUE.set(true);
                break;
            case "hardened":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.hardened"));
                VDM.config.HARDENED.set(true);
                break;
            case "anger":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.anger"));
                VDM.config.ANGER.set(true);
                break;
            case "unstable":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.unstable"));
                VDM.config.UNSTABLE.set(true);
                break;
            case "kinetic":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.kinetic"));
                VDM.config.KINETIC.set(true);
                break;
            case "undying":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.undying"));
                VDM.config.UNDYING.set(true);
                break;
            case "fuelefficient":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.fuelefficient"));
                VDM.config.FUELEFFICIENT.set(true);
                break;
            case "blacksmithing":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.blacksmithing"));
                VDM.config.BLACKSMITHING.set(true);
                break;
            case "warranty":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.warranty"));
                VDM.config.WARRANTY.set(true);
                break;
            case "flammable":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.flammable"));
                VDM.config.FLAMMABLE.set(true);
                break;
            case "vegetarian":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.vegetarian"));
                VDM.config.VEGETARIAN.set(true);
                break;
            case "wrong":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.wrong"));
                VDM.config.WRONG.set(true);
                break;
            case "pandemic":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.pandemic"));
                VDM.config.PANDEMIC.set(true);
                break;
            case "wild":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.wild"));
                VDM.config.WILD.set(true);
                break;
            case "rested":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.rested"));
                VDM.config.RESTED.set(true);
                break;
            case "celebration":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.celebration"));
                VDM.config.CELEBRATION.set(true);
                break;
            case "heroic":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.allwarning").withStyle(TextFormatting.RED, TextFormatting.BOLD));
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.allon"));
                VDM.config.BLACKEYE.set(true);
                VDM.config.CANNON.set(true);
                VDM.config.VENOM.set(true);
                VDM.config.SHIFT.set(true);
                VDM.config.KARMICJUSTICE.set(true);
                VDM.config.AGING.set(true);
                VDM.config.SOFTSKIN.set(true);
                VDM.config.FATIGUE.set(true);
                VDM.config.HARDENED.set(true);
                VDM.config.ANGER.set(true);
                VDM.config.UNSTABLE.set(true);
                VDM.config.FLAMMABLE.set(true);
                VDM.config.WRONG.set(true);
                VDM.config.VEGETARIAN.set(true);
                VDM.config.PANDEMIC.set(true);
                break;
            case "keystothecity":
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.keysallwarning").withStyle(TextFormatting.BLUE, TextFormatting.BOLD));
                broadcast(context.getLevel().getServer(), new TranslationTextComponent("activation.villainousdifficultymultipliers.keysallon"));
                VDM.config.KINETIC.set(true);
                VDM.config.UNDYING.set(true);
                VDM.config.FUELEFFICIENT.set(true);
                VDM.config.BLACKSMITHING.set(true);
                VDM.config.WARRANTY.set(true);
                VDM.config.WILD.set(true);
                VDM.config.RESTED.set(true);
                VDM.config.CELEBRATION.set(true);
                break;
            default:
                context.sendFailure(new TranslationTextComponent("activation.villainousdifficultymultipliers.invalid").withStyle(TextFormatting.RED));
                context.sendFailure(new TranslationTextComponent("error.villainousdifficultymultipliers.listmultipliers"));
                break;
        }
        return 0;
    }

    private static void broadcast(MinecraftServer server, ITextComponent translationTextComponent){
        server.getPlayerList().broadcastMessage(translationTextComponent, ChatType.CHAT, UUID.randomUUID());
    }
}
