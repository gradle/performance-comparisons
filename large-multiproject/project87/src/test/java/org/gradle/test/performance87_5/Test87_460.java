package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_460 {
    private final Production87_460 production = new Production87_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}