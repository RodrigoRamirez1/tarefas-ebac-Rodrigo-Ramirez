public class FabricaCarroFusca implements IFabricaCarros{
    @Override
    public ICarro fabricar() {
        return new Fusca();
    }
}
