package com.uam.springboot.app.Entidad;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Alumnos")
public class Alumno {
	
	/*@Id
	private String id;
	
	private String matricula;
	private String nombre;
	private String apellidoM;
	private String apellidoP;
	private String carrera;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}*/
	
	@Id
	private String id;
	
	private String MAT;
	private String UNI;
	private String DIV;
	private String NIV;
	private String PLA;
	private String ARE;
	private String RFC;
	private String CAU;
	private String CAD;
	private String CAP;
	private String TUR;
	private String DED;
	private String EDO;
	private String CRE_ACUM;
	private String TRII;
	private String UT_AA;
	private String UT_RE;
	private String NAS;
	private String CRE_PLA;
	private String EDO2;
	private String CRE2;//"CRE2": "500",
	private String TRII2;
	private String UT_AA2;
	private String UT_RE2;
	private String AING;
	private String UA_AA2;
	private String UA_RE2;
	private String NA;
	private String S;
	private String B;
	private String MB;
	private String PROMUAM;
	private String OTRA_CAL;
	private String NTRI;
	private String NTRC;
	private String ESC; //"ESC": "2",
	private String PROM;
	private String FNA;
	private String EDAD;
	private String SEXO;
	private String PUNTAJE;
	private String TEL;
	private String NAL;
	private String EDCAL;
	private String FECNAC;
	private String ADEUDO;
	private String NNTRE;
	private String ANO_TITULA;
	private String UT_IUEA;
	private String UT_IUEA2;
	private String UEA_INS;
	private String CRE_INS;
	private String ORIGEN_MAT;
	private String ED_AL_TIT;
	private String PRORROGA;
	private String FOLIO;
	private String MOTIVO_BAJ;
	private String TRI_UBICA;
	private String CRED_CONTA;//cred_conta
	private String BECA_PRONA;//"BECA_PRONA": "N",
	private String CRE_EXC;//"CRE_EXC": "3",
	private String CRE_MIN;// "CRE_MIN": "4
	private String CRE_MAX;//"CRE_MAX": "456",
	private String TRI_CMINCU;//"TRI_CMINCU": "92O",
	private String   PATE;
	private String   MATE;
	private String  NOM;
	private String CALLE;
	private String COLONIA;
	private String CODIGOP;
	private String DELEG_MPIO;
	private String LUG_NACIMT;
	private String PORCENTAJE;
	private String FECHA_TITU;
	private String TRI_TITULA;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMAT() {
		return MAT;
	}
	public void setMAT(String mAT) {
		MAT = mAT;
	}
	public String getPATE() {
		return PATE;
	}
	public void setPATE(String pATE) {
		PATE = pATE;
	}
	public String getMATE() {
		return MATE;
	}
	public void setMATE(String mATE) {
		MATE = mATE;
	}
	public String getNOM() {
		return NOM;
	}
	public void setNOM(String nOM) {
		NOM = nOM;
	}
	public String getCALLE() {
		return CALLE;
	}
	public void setCALLE(String cALLE) {
		CALLE = cALLE;
	}
	public String getCOLONIA() {
		return COLONIA;
	}
	public void setCOLONIA(String cOLONIA) {
		COLONIA = cOLONIA;
	}
	public String getCODIGOP() {
		return CODIGOP;
	}
	public void setCODIGOP(String cODIGOP) {
		CODIGOP = cODIGOP;
	}
	public String getDELEG_MPIO() {
		return DELEG_MPIO;
	}
	public void setDELEG_MPIO(String dELEG_MPIO) {
		DELEG_MPIO = dELEG_MPIO;
	}
	public String getLUG_NACIMT() {
		return LUG_NACIMT;
	}
	public void setLUG_NACIMT(String lUG_NACIMT) {
		LUG_NACIMT = lUG_NACIMT;
	}
	public String getPORCENTAJE() {
		return PORCENTAJE;
	}
	public void setPORCENTAJE(String pORCENTAJE) {
		PORCENTAJE = pORCENTAJE;
	}
	public String getFECHA_TITU() {
		return FECHA_TITU;
	}
	public void setFECHA_TITU(String fECHA_TITU) {
		FECHA_TITU = fECHA_TITU;
	}
	public String getTRI_TITULA() {
		return TRI_TITULA;
	}
	public void setTRI_TITULA(String tRI_TITULA) {
		TRI_TITULA = tRI_TITULA;
	}
	public String getUNI() {
		return UNI;
	}
	public void setUNI(String uNI) {
		UNI = uNI;
	}
	public String getDIV() {
		return DIV;
	}
	public void setDIV(String dIV) {
		DIV = dIV;
	}
	public String getNIV() {
		return NIV;
	}
	public void setNIV(String nIV) {
		NIV = nIV;
	}
	public String getPLA() {
		return PLA;
	}
	public void setPLA(String pLA) {
		PLA = pLA;
	}
	public String getARE() {
		return ARE;
	}
	public void setARE(String aRE) {
		ARE = aRE;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public String getCAU() {
		return CAU;
	}
	public void setCAU(String cAU) {
		CAU = cAU;
	}
	public String getCAD() {
		return CAD;
	}
	public void setCAD(String cAD) {
		CAD = cAD;
	}
	public String getCAP() {
		return CAP;
	}
	public void setCAP(String cAP) {
		CAP = cAP;
	}
	public String getTUR() {
		return TUR;
	}
	public void setTUR(String tUR) {
		TUR = tUR;
	}
	public String getDED() {
		return DED;
	}
	public void setDED(String dED) {
		DED = dED;
	}
	public String getEDO() {
		return EDO;
	}
	public void setEDO(String eDO) {
		EDO = eDO;
	}
	public String getCRE_ACUM() {
		return CRE_ACUM;
	}
	public void setCRE_ACUM(String cRE_ACUM) {
		CRE_ACUM = cRE_ACUM;
	}
	public String getTRII() {
		return TRII;
	}
	public void setTRII(String tRII) {
		TRII = tRII;
	}
	public String getUT_AA() {
		return UT_AA;
	}
	public void setUT_AA(String uT_AA) {
		UT_AA = uT_AA;
	}
	public String getUT_RE() {
		return UT_RE;
	}
	public void setUT_RE(String uT_RE) {
		UT_RE = uT_RE;
	}
	public String getNAS() {
		return NAS;
	}
	public void setNAS(String nAS) {
		NAS = nAS;
	}
	public String getCRE_PLA() {
		return CRE_PLA;
	}
	public void setCRE_PLA(String cRE_PLA) {
		CRE_PLA = cRE_PLA;
	}
	public String getEDO2() {
		return EDO2;
	}
	public void setEDO2(String eDO2) {
		EDO2 = eDO2;
	}
	public String getCRE2() {
		return CRE2;
	}
	public void setCRE2(String cRE2) {
		CRE2 = cRE2;
	}
	public String getTRII2() {
		return TRII2;
	}
	public void setTRII2(String tRII2) {
		TRII2 = tRII2;
	}
	public String getUT_AA2() {
		return UT_AA2;
	}
	public void setUT_AA2(String uT_AA2) {
		UT_AA2 = uT_AA2;
	}
	public String getUT_RE2() {
		return UT_RE2;
	}
	public void setUT_RE2(String uT_RE2) {
		UT_RE2 = uT_RE2;
	}
	public String getAING() {
		return AING;
	}
	public void setAING(String aING) {
		AING = aING;
	}
	public String getUA_AA2() {
		return UA_AA2;
	}
	public void setUA_AA2(String uA_AA2) {
		UA_AA2 = uA_AA2;
	}
	public String getUA_RE2() {
		return UA_RE2;
	}
	public void setUA_RE2(String uA_RE2) {
		UA_RE2 = uA_RE2;
	}
	public String getNA() {
		return NA;
	}
	public void setNA(String nA) {
		NA = nA;
	}
	public String getS() {
		return S;
	}
	public void setS(String s) {
		S = s;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getMB() {
		return MB;
	}
	public void setMB(String mB) {
		MB = mB;
	}
	public String getPROMUAM() {
		return PROMUAM;
	}
	public void setPROMUAM(String pROMUAM) {
		PROMUAM = pROMUAM;
	}
	public String getOTRA_CAL() {
		return OTRA_CAL;
	}
	public void setOTRA_CAL(String oTRA_CAL) {
		OTRA_CAL = oTRA_CAL;
	}
	public String getNTRI() {
		return NTRI;
	}
	public void setNTRI(String nTRI) {
		NTRI = nTRI;
	}
	public String getNTRC() {
		return NTRC;
	}
	public void setNTRC(String nTRC) {
		NTRC = nTRC;
	}
	public String getESC() {
		return ESC;
	}
	public void setESC(String eSC) {
		ESC = eSC;
	}
	public String getPROM() {
		return PROM;
	}
	public void setPROM(String pROM) {
		PROM = pROM;
	}
	public String getFNA() {
		return FNA;
	}
	public void setFNA(String fNA) {
		FNA = fNA;
	}
	public String getEDAD() {
		return EDAD;
	}
	public void setEDAD(String eDAD) {
		EDAD = eDAD;
	}
	public String getSEXO() {
		return SEXO;
	}
	public void setSEXO(String sEXO) {
		SEXO = sEXO;
	}
	public String getPUNTAJE() {
		return PUNTAJE;
	}
	public void setPUNTAJE(String pUNTAJE) {
		PUNTAJE = pUNTAJE;
	}
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tEL) {
		TEL = tEL;
	}
	public String getNAL() {
		return NAL;
	}
	public void setNAL(String nAL) {
		NAL = nAL;
	}
	public String getEDCAL() {
		return EDCAL;
	}
	public void setEDCAL(String eDCAL) {
		EDCAL = eDCAL;
	}
	public String getFECNAC() {
		return FECNAC;
	}
	public void setFECNAC(String fECNAC) {
		FECNAC = fECNAC;
	}
	public String getADEUDO() {
		return ADEUDO;
	}
	public void setADEUDO(String aDEUDO) {
		ADEUDO = aDEUDO;
	}
	public String getNNTRE() {
		return NNTRE;
	}
	public void setNNTRE(String nNTRE) {
		NNTRE = nNTRE;
	}
	public String getANO_TITULA() {
		return ANO_TITULA;
	}
	public void setANO_TITULA(String aNO_TITULA) {
		ANO_TITULA = aNO_TITULA;
	}
	public String getUT_IUEA() {
		return UT_IUEA;
	}
	public void setUT_IUEA(String uT_IUEA) {
		UT_IUEA = uT_IUEA;
	}
	public String getUT_IUEA2() {
		return UT_IUEA2;
	}
	public void setUT_IUEA2(String uT_IUEA2) {
		UT_IUEA2 = uT_IUEA2;
	}
	public String getUEA_INS() {
		return UEA_INS;
	}
	public void setUEA_INS(String uEA_INS) {
		UEA_INS = uEA_INS;
	}
	public String getCRE_INS() {
		return CRE_INS;
	}
	public void setCRE_INS(String cRE_INS) {
		CRE_INS = cRE_INS;
	}
	public String getORIGEN_MAT() {
		return ORIGEN_MAT;
	}
	public void setORIGEN_MAT(String oRIGEN_MAT) {
		ORIGEN_MAT = oRIGEN_MAT;
	}
	public String getED_AL_TIT() {
		return ED_AL_TIT;
	}
	public void setED_AL_TIT(String eD_AL_TIT) {
		ED_AL_TIT = eD_AL_TIT;
	}
	public String getPRORROGA() {
		return PRORROGA;
	}
	public void setPRORROGA(String pRORROGA) {
		PRORROGA = pRORROGA;
	}
	public String getFOLIO() {
		return FOLIO;
	}
	public void setFOLIO(String fOLIO) {
		FOLIO = fOLIO;
	}
	public String getMOTIVO_BAJ() {
		return MOTIVO_BAJ;
	}
	public void setMOTIVO_BAJ(String mOTIVO_BAJ) {
		MOTIVO_BAJ = mOTIVO_BAJ;
	}
	public String getTRI_UBICA() {
		return TRI_UBICA;
	}
	public void setTRI_UBICA(String tRI_UBICA) {
		TRI_UBICA = tRI_UBICA;
	}
	public String getCRED_CONTA() {
		return CRED_CONTA;
	}
	public void setCRED_CONTA(String cRED_CONTA) {
		CRED_CONTA = cRED_CONTA;
	}
	public String getBECA_PRONA() {
		return BECA_PRONA;
	}
	public void setBECA_PRONA(String bECA_PRONA) {
		BECA_PRONA = bECA_PRONA;
	}
	public String getCRE_EXC() {
		return CRE_EXC;
	}
	public void setCRE_EXC(String cRE_EXC) {
		CRE_EXC = cRE_EXC;
	}
	public String getCRE_MIN() {
		return CRE_MIN;
	}
	public void setCRE_MIN(String cRE_MIN) {
		CRE_MIN = cRE_MIN;
	}
	public String getCRE_MAX() {
		return CRE_MAX;
	}
	public void setCRE_MAX(String cRE_MAX) {
		CRE_MAX = cRE_MAX;
	}
	public String getTRI_CMINCU() {
		return TRI_CMINCU;
	}
	public void setTRI_CMINCU(String tRI_CMINCU) {
		TRI_CMINCU = tRI_CMINCU;
	}
	
	
}
