package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_460 {
    private final Production1_460 production = new Production1_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}