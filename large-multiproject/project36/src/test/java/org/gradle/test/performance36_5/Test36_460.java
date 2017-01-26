package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_460 {
    private final Production36_460 production = new Production36_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}