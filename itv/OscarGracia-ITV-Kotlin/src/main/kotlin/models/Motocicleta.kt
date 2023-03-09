package models

class Motocicleta( val cilindrada:Int = 0,
                   override var matricula: String, override var modelo:String, override var tipoMotor: TipoMotor,
                   override var   kilometrosVehiculo:Int, override var fechaMatriculacion:String,
                   override var fechaUltimaRevision:String, override var apto:Boolean):Vehiculo() {

}