package gregicadditions;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = GregicAdditions.MODID)
@Config(modid = GregicAdditions.MODID)
public class GAConfig {

	@Config.Comment("Config options for GT6 features")
	public static GT6 GT6 = new GT6();

	public static class GT6 {
		@Config.Comment("Bending Recipes (disabling Bending Cylinders' recipes disables all of them)")
		@Config.Name("Bending - Bending Cylinders' recipes")
		public boolean BendingCylinders = true;
		@Config.Name("Bending - Curved Plates' recipes")
		public boolean BendingCurvedPlates = true;
		@Config.Name("Bending - Rotors require Curved Plates")
		public boolean BendingRotors = true;
		@Config.Name("Bending - Rings are crafted with Bending Cylinders")
		public boolean BendingRings = true;
		@Config.Name("Bending - Foils are made with Bending Cylinders")
		public boolean BendingFoils = true;
		@Config.Name("Bending - Foils are automated in the Cluster Mill instead of the Bending Machine")
		public boolean BendingFoilsAutomatic = true;
		@Config.Name("Bending - Pipes are crafted with Curved Plates")
		public boolean BendingPipes = true;

		@Config.Comment("Set this to false to disable Plates being crafted from Double Ingots")
		@Config.Name("Plates are crafted from Double Ingots")
		public boolean PlateDoubleIngot = true;

		@Config.Comment("Set this to false to enable the GT5 Wrench recipes")
		@Config.Name("Wrenches are crafted with Plates instead of Ingots")
		public boolean ExpensiveWrenches = true;

		@Config.Comment("Set this to false to disable Drums")
		@Config.Name("Should Drums be registered?")
		public boolean registerDrums = true;

		@Config.Comment("Set this to false to disable the support for Forestry Electron Tubes")
		@Config.Name("Should Electrodes be registered?")
		public boolean electrodes = true;

		@Config.Comment("Set this to false to disable double ingots")
		@Config.Name("Should double ingots be registered?")
		public boolean addDoubleIngots = true;

		@Config.Comment("Set this to false to disable curved plates")
		@Config.Name("Should curved plates be registered?")
		public boolean addCurvedPlates = true;
	}

	@Config.Comment("Config options for GT5U features")
	public static GT5U GT5U = new GT5U();

	public static class GT5U {
		@Config.Comment("Set to false to disable GT5U Cable isolation recipes")
		@Config.Name("Cables can be isolated with different combinations of Rubbers and Dusts with varying efficiencies")
		public boolean CablesGT5U = true;

		@Config.Comment("Set these to false to disable the generated Compressor recipes for blocks")
		@Config.Name("Compression - Generate Compressor recipes for blocks")
		public boolean GenerateCompressorRecipes = true;
		@Config.Name("Compression - Remove 3x3 crafting recipes for blocks")
		public boolean Remove3x3BlockRecipes = true;
		@Config.Name("Compression - Remove crafting recipes for uncompressing blocks")
		public boolean RemoveBlockUncraftingRecipes = true;

		@Config.Comment("Set to false to enable Log>Charcoal smelting recipes")
		@Config.Name("All Log to Charcoal smelting recipes will be removed")
		public boolean DisableLogToCharcoalSmelting = true;

		@Config.Comment("Set to false to disable generated wood sawing recipes")
		@Config.Name("A saw is required to get 4 Planks per Log")
		public boolean GeneratedSawingRecipes = true;

		@Config.Comment("Set these to false to disable the higher tier versions of machines")
		@Config.Name("Should higher tier Alloy Smelters be registered?")
		public boolean highTierAlloySmelter = true;
		@Config.Name("Should higher tier Arc Furnaces be registered?")
		public boolean highTierArcFurnaces = true;
		@Config.Name("Should higher tier Assembling Machines be registered?")
		public boolean highTierAssemblers = true;
		@Config.Name("Should higher tier Autoclaves be registered?")
		public boolean highTierAutoclaves = true;
		@Config.Name("Should higher tier Bending Machines be registered?")
		public boolean highTierBenders = true;
		@Config.Name("Should higher tier Breweries be registered?")
		public boolean highTierBreweries = true;
		@Config.Name("Should higher tier Canning Machines be registered?")
		public boolean highTierCanners = true;
		@Config.Name("Should higher tier Centrifuges be registered?")
		public boolean highTierCentrifuges = true;
		@Config.Name("Should higher tier Chemical Baths be registered?")
		public boolean highTierChemicalBaths = true;
		@Config.Name("Should higher tier Chemical Reactors be registered?")
		public boolean highTierChemicalReactors = true;
		@Config.Name("Should higher tier Compressors be registered?")
		public boolean highTierCompressors = true;
		@Config.Name("Should higher tier Cutting Machines be registered?")
		public boolean highTierCutters = true;
		@Config.Name("Should higher tier Cluster Mills be registered?")
		public boolean highTierClusterMills = true;
		@Config.Name("Should higher tier Distilleries be registered?")
		public boolean highTierDistilleries = true;
		@Config.Name("Should higher tier Electric Furnaces be registered?")
		public boolean highTierElectricFurnace = true;
		@Config.Name("Should higher tier Electrolyzers be registered?")
		public boolean highTierElectrolyzers = true;
		@Config.Name("Should higher tier Electromagnetic Separators be registered?")
		public boolean highTierElectromagneticSeparators = true;
		@Config.Name("Should higher tier Extractors be registered?")
		public boolean highTierExtractors = true;
		@Config.Name("Should higher tier Extruders be registered?")
		public boolean highTierExtruders = true;
		@Config.Name("Should higher tier Fermenters be registered?")
		public boolean highTierFermenters = true;
		@Config.Name("Should higher tier Fluid Canners be registered?")
		public boolean highTierFluidCanners = true;
		@Config.Name("Should higher tier Fluid Extractors be registered?")
		public boolean highTierFluidExtractors = true;
		@Config.Name("Should higher tier Fluid Heaters be registered?")
		public boolean highTierFluidHeaters = true;
		@Config.Name("Should higher tier Fluid Solidifiers be registered?")
		public boolean highTierFluidSolidifiers = true;
		@Config.Name("Should higher tier Forge Hammers be registered?")
		public boolean highTierForgeHammers = true;
		@Config.Name("Should higher tier Forming Presses be registered?")
		public boolean highTierFormingPresses = true;
		@Config.Name("Should higher tier Lathes be registered?")
		public boolean highTierLathes = true;
		@Config.Name("Should higher tier Microwaves be registered?")
		public boolean highTierMicrowaves = true;
		@Config.Name("Should higher tier Mixers be registered?")
		public boolean highTierMixers = true;
		@Config.Name("Should higher tier Ore Washers be registered?")
		public boolean highTierOreWashers = true;
		@Config.Name("Should higher tier Packagers be registered?")
		public boolean highTierPackers = true;
		@Config.Name("Should higher tier Plasma Arc Furnaces be registered?")
		public boolean highTierPlasmaArcFurnaces = true;
		@Config.Name("Should higher tier Polarizers be registered?")
		public boolean highTierPolarizers = true;
		@Config.Name("Should higher tier Precision Laser Engravers be registered?")
		public boolean highTierLaserEngravers = true;
		@Config.Name("Should higher tier Pumps be registered?")
		public boolean highTierPumps = true;
		@Config.Name("Should higher tier Replicators be registered?")
		public boolean highTierReplicators = true;
		@Config.Name("Should higher tier Sifting Machines be registered?")
		public boolean highTierSifters = true;
		@Config.Name("Should higher tier Thermal Centrifuges be registered?")
		public boolean highTierThermalCentrifuges = true;
		@Config.Name("Should higher tier Macerators be registered?")
		public boolean highTierMacerators = true;
		@Config.Name("Should higher tier Mass Fabricators be registered?")
		public boolean highTierMassFabs = true;
		@Config.Name("Should higher tier Unpackagers be registered?")
		public boolean highTierUnpackers = true;
		@Config.Name("Should higher tier Wiremills be registered?")
		public boolean highTierWiremills = true;

		@Config.Comment("Set these to true to enable certain Batteries.")
		@Config.Name("Batteries - Enable an extra ZPM and UV Battery (this also makes the Ultimate Battery harder to make)")
		public boolean enableZPMandUVBats = false;
		@Config.Name("Batteries - Replace the Ultimate Battery with a MAX Battery")
		public boolean replaceUVwithMAXBat = false;
	}

	@Config.Comment("Config options of the Processing Array")
	public static ProcessingArray processingArray = new ProcessingArray();

	public static class ProcessingArray {

		@Config.Comment("Number of machines the Processing Array can use at a time. Default: 16")
		@Config.RangeInt(min = 1, max = 64)
		public int processingArrayMachineLimit = 16;

		@Config.Comment({"Blacklist of machines for the Processing Array.",
						"Add the unlocalized Recipe Map name to blacklist the machine."})
		public String[] machineBlackList = new String[0];

	}



	@Config.Comment("Config options of GTCE Bees features")
	public static GTBees GTBees = new GTBees();

	public static class GTBees {

		@Config.RequiresMcRestart
		@Config.Comment("Enable/Disable all GT Bees features")
		public boolean EnableGTCEBees = true;

		@Config.Comment("Generate a recipe in the GT Centrifuge for every recipe in the Forestry Centrifuge")
		public boolean GenerateCentrifugeRecipes = true;

		@Config.Comment("Generate a recipe in the Fluid Extractor for every recipe in the Squeezer")
		public boolean GenerateExtractorRecipes = true;

		@Config.Comment("Add Autoclave recipes for the Combs")
		public boolean AutoclaveRecipes = true;

		@Config.Comment("Add Chemical Reactor recipes for the Combs")
		public boolean ReactorRecipes = true;

		@Config.Comment("Add Assembling Machine recipes for Impregnated items")
		public boolean AssemblerRecipes = true;
	}

	@Config.Comment("Config options for GregsConstruct features")
	public static GregsConstruct GregsConstruct = new GregsConstruct();

	public static class GregsConstruct {

		@Config.RequiresMcRestart
		@Config.Comment("Enable/Disable all GregsConstruct features")
		public boolean EnableGregsConstruct = true;

		@Config.Comment("Add Tools with GT Metals to Tinkers")
		public boolean TinkersMetalTools = true;

		@Config.Comment("Add Tools with GT Gems to Tinkers")
		public boolean TinkersGemTools = true;

		@Config.Comment("Add Smelting for GT Materials to Tinkers Smeltery")
		public boolean TinkersMaterialsSmelting = true;

		@Config.Comment("Add Alloying of GT Materials to Tinkers Smeltery")
		public boolean TinkersMaterialAlloying = true;

		@Config.Comment("Enable Glass recipe changes")
		public boolean GregsConstructGlassProcessing = true;
	}

	@Config.Comment("Config options of miscellaneous features")
	public static Misc Misc = new Misc();

	public static class Misc {
		@Config.Comment("Set these to false to disable the generated Packager and Unpackager recipes")
		@Config.Name("Packaging - 1x1 recipes with 9 outputs can be automated with the Unpackager")
		public boolean Unpackager3x3Recipes = true;
		@Config.Name("Packaging - 3x3 recipes can automated with the Packagers")
		public boolean Packager3x3Recipes = true;
		@Config.Name("Packaging - 2x2 recipes can automated with the Packagers")
		public boolean Packager2x2Recipes = true;
		@Config.Name("Packaging - Dust compressing can automated with the Packagers")
		public boolean PackagerDustRecipes = true;

		@Config.Comment("Set this to false to disable the Forestry Integration")
		@Config.Name("Forestry's Ethanol and Seed Oil are used in recipes instead of GTCE's")
		public boolean ForestryIntegration = true;

		@Config.Comment("Set this to false to disable Crates")
		@Config.Name("Should Crates be registered?")
		public boolean registerCrates = true;

		@Config.Comment("Set this to false to disable the high tier Air Collectors")
		@Config.Name("Air Collector have IV and LuV version")
		public boolean highTierCollector = true;

		@Config.Name("Should higher tier Bundlers be registered?")
		public boolean highTierBundler = true;
	}

	@SubscribeEvent
	static void configChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
		if(GregicAdditions.MODID.equals(event.getModID())) {
			ConfigManager.sync(GregicAdditions.MODID, Config.Type.INSTANCE);
		}
	}

}
