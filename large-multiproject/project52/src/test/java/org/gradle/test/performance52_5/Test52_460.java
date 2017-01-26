package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_460 {
    private final Production52_460 production = new Production52_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}