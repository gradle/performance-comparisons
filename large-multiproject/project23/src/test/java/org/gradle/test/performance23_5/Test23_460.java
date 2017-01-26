package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_460 {
    private final Production23_460 production = new Production23_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}