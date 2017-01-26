package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_460 {
    private final Production2_460 production = new Production2_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}