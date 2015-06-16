// Automatically generated on 2015-06-16T15:35:11-07:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct SetOptionsOp
//  {
//      AccountID* inflationDest; // sets the inflation destination
//  
//      uint32* clearFlags; // which flags to clear
//      uint32* setFlags;   // which flags to set
//  
//      Thresholds* thresholds; // update the thresholds for the account
//  
//      string32* homeDomain; // sets the home domain
//  
//      // Add, update or remove a signer for the account
//      // signer is deleted if the weight is 0
//      Signer* signer;
//  };

//  ===========================================================================
public class SetOptionsOp  {
  public SetOptionsOp () {}
  private AccountID inflationDest;
  public AccountID getinflationDest() {
    return this.inflationDest;
  }
  public void setinflationDest(AccountID value) {
    this.inflationDest = value;
  }
  private Uint32 clearFlags;
  public Uint32 getclearFlags() {
    return this.clearFlags;
  }
  public void setclearFlags(Uint32 value) {
    this.clearFlags = value;
  }
  private Uint32 setFlags;
  public Uint32 getsetFlags() {
    return this.setFlags;
  }
  public void setsetFlags(Uint32 value) {
    this.setFlags = value;
  }
  private Thresholds thresholds;
  public Thresholds getthresholds() {
    return this.thresholds;
  }
  public void setthresholds(Thresholds value) {
    this.thresholds = value;
  }
  private String32 homeDomain;
  public String32 gethomeDomain() {
    return this.homeDomain;
  }
  public void sethomeDomain(String32 value) {
    this.homeDomain = value;
  }
  private Signer signer;
  public Signer getsigner() {
    return this.signer;
  }
  public void setsigner(Signer value) {
    this.signer = value;
  }
  public static void encode(XdrDataOutputStream stream, SetOptionsOp encodedSetOptionsOp) throws IOException{
    if (encodedSetOptionsOp.inflationDest != null) {
    AccountID.encode(stream, encodedSetOptionsOp.inflationDest);
    }
    if (encodedSetOptionsOp.clearFlags != null) {
    Uint32.encode(stream, encodedSetOptionsOp.clearFlags);
    }
    if (encodedSetOptionsOp.setFlags != null) {
    Uint32.encode(stream, encodedSetOptionsOp.setFlags);
    }
    if (encodedSetOptionsOp.thresholds != null) {
    Thresholds.encode(stream, encodedSetOptionsOp.thresholds);
    }
    if (encodedSetOptionsOp.homeDomain != null) {
    String32.encode(stream, encodedSetOptionsOp.homeDomain);
    }
    if (encodedSetOptionsOp.signer != null) {
    Signer.encode(stream, encodedSetOptionsOp.signer);
    }
  }
  public static SetOptionsOp decode(XdrDataInputStream stream) throws IOException {
    SetOptionsOp decodedSetOptionsOp = new SetOptionsOp();
    int inflationDestPresent = stream.readInt();
    if (inflationDestPresent != 0) {
    decodedSetOptionsOp.inflationDest = AccountID.decode(stream);
    }
    int clearFlagsPresent = stream.readInt();
    if (clearFlagsPresent != 0) {
    decodedSetOptionsOp.clearFlags = Uint32.decode(stream);
    }
    int setFlagsPresent = stream.readInt();
    if (setFlagsPresent != 0) {
    decodedSetOptionsOp.setFlags = Uint32.decode(stream);
    }
    int thresholdsPresent = stream.readInt();
    if (thresholdsPresent != 0) {
    decodedSetOptionsOp.thresholds = Thresholds.decode(stream);
    }
    int homeDomainPresent = stream.readInt();
    if (homeDomainPresent != 0) {
    decodedSetOptionsOp.homeDomain = String32.decode(stream);
    }
    int signerPresent = stream.readInt();
    if (signerPresent != 0) {
    decodedSetOptionsOp.signer = Signer.decode(stream);
    }
    return decodedSetOptionsOp;
  }
}