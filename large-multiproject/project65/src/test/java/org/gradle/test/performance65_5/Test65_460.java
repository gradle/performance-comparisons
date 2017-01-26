package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_460 {
    private final Production65_460 production = new Production65_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}