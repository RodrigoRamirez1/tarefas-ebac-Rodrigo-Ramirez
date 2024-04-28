public class FabricaCarroByd implements IFabricaCarros{
    @Override
    public ICarro fabricar() {
        return new Byd();
    }
}
