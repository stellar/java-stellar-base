// Automatically generated on 2015-06-16T15:35:11-07:00
// DO NOT EDIT or your changes may be overwritten

package org.stellar.base.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union StellarMessage switch (MessageType type)
//  {
//  case ERROR_MSG:
//      Error error;
//  case HELLO:
//      Hello hello;
//  case DONT_HAVE:
//      DontHave dontHave;
//  case GET_PEERS:
//      void;
//  case PEERS:
//      PeerAddress peers<>;
//  
//  case GET_TX_SET:
//      uint256 txSetHash;
//  case TX_SET:
//      TransactionSet txSet;
//  
//  case TRANSACTION:
//      TransactionEnvelope transaction;
//  
//  // SCP
//  case GET_SCP_QUORUMSET:
//      uint256 qSetHash;
//  case SCP_QUORUMSET:
//      SCPQuorumSet qSet;
//  case SCP_MESSAGE:
//      SCPEnvelope envelope;
//  };

//  ===========================================================================
public class StellarMessage  {
  public StellarMessage () {}
  MessageType type;
  public MessageType getDiscriminant() {
    return this.type;
  }
  public void setDiscriminant(MessageType value) {
    this.type = value;
  }
  private Error error;
  public Error geterror() {
    return this.error;
  }
  public void seterror(Error value) {
    this.error = value;
  }
  private Hello hello;
  public Hello gethello() {
    return this.hello;
  }
  public void sethello(Hello value) {
    this.hello = value;
  }
  private DontHave dontHave;
  public DontHave getdontHave() {
    return this.dontHave;
  }
  public void setdontHave(DontHave value) {
    this.dontHave = value;
  }
  private PeerAddress[] peers;
  public PeerAddress[] getpeers() {
    return this.peers;
  }
  public void setpeers(PeerAddress[] value) {
    this.peers = value;
  }
  private Uint256 txSetHash;
  public Uint256 gettxSetHash() {
    return this.txSetHash;
  }
  public void settxSetHash(Uint256 value) {
    this.txSetHash = value;
  }
  private TransactionSet txSet;
  public TransactionSet gettxSet() {
    return this.txSet;
  }
  public void settxSet(TransactionSet value) {
    this.txSet = value;
  }
  private TransactionEnvelope transaction;
  public TransactionEnvelope gettransaction() {
    return this.transaction;
  }
  public void settransaction(TransactionEnvelope value) {
    this.transaction = value;
  }
  private Uint256 qSetHash;
  public Uint256 getqSetHash() {
    return this.qSetHash;
  }
  public void setqSetHash(Uint256 value) {
    this.qSetHash = value;
  }
  private SCPQuorumSet qSet;
  public SCPQuorumSet getqSet() {
    return this.qSet;
  }
  public void setqSet(SCPQuorumSet value) {
    this.qSet = value;
  }
  private SCPEnvelope envelope;
  public SCPEnvelope getenvelope() {
    return this.envelope;
  }
  public void setenvelope(SCPEnvelope value) {
    this.envelope = value;
  }
  public static void encode(XdrDataOutputStream stream, StellarMessage encodedStellarMessage) throws IOException {
    switch (encodedStellarMessage.getDiscriminant()) {
  case ERROR_MSG:
  Error.encode(stream, encodedStellarMessage.error);
  break;
  case HELLO:
  Hello.encode(stream, encodedStellarMessage.hello);
  break;
  case DONT_HAVE:
  DontHave.encode(stream, encodedStellarMessage.dontHave);
  break;
  case GET_PEERS:
  break;
  case PEERS:
  int peerssize = encodedStellarMessage.getpeers().length;
  stream.writeInt(peerssize);
  for (int i = 0; i < peerssize; i++) {
    PeerAddress.encode(stream, encodedStellarMessage.peers[i]);
  }
  break;
  case GET_TX_SET:
  Uint256.encode(stream, encodedStellarMessage.txSetHash);
  break;
  case TX_SET:
  TransactionSet.encode(stream, encodedStellarMessage.txSet);
  break;
  case TRANSACTION:
  TransactionEnvelope.encode(stream, encodedStellarMessage.transaction);
  break;
  case GET_SCP_QUORUMSET:
  Uint256.encode(stream, encodedStellarMessage.qSetHash);
  break;
  case SCP_QUORUMSET:
  SCPQuorumSet.encode(stream, encodedStellarMessage.qSet);
  break;
  case SCP_MESSAGE:
  SCPEnvelope.encode(stream, encodedStellarMessage.envelope);
  break;
  }
  }
  public static StellarMessage decode(XdrDataInputStream stream) throws IOException {
    StellarMessage decodedStellarMessage = new StellarMessage();
    switch (decodedStellarMessage.getDiscriminant()) {
  case ERROR_MSG:
  decodedStellarMessage.error = Error.decode(stream);
  break;
  case HELLO:
  decodedStellarMessage.hello = Hello.decode(stream);
  break;
  case DONT_HAVE:
  decodedStellarMessage.dontHave = DontHave.decode(stream);
  break;
  case GET_PEERS:
  break;
  case PEERS:
  int peerssize = stream.readInt();
  decodedStellarMessage.peers = new PeerAddress[peerssize];
  for (int i = 0; i < peerssize; i++) {
    decodedStellarMessage.peers[i] = PeerAddress.decode(stream);
  }
  break;
  case GET_TX_SET:
  decodedStellarMessage.txSetHash = Uint256.decode(stream);
  break;
  case TX_SET:
  decodedStellarMessage.txSet = TransactionSet.decode(stream);
  break;
  case TRANSACTION:
  decodedStellarMessage.transaction = TransactionEnvelope.decode(stream);
  break;
  case GET_SCP_QUORUMSET:
  decodedStellarMessage.qSetHash = Uint256.decode(stream);
  break;
  case SCP_QUORUMSET:
  decodedStellarMessage.qSet = SCPQuorumSet.decode(stream);
  break;
  case SCP_MESSAGE:
  decodedStellarMessage.envelope = SCPEnvelope.decode(stream);
  break;
  }
    return decodedStellarMessage;
  }
}