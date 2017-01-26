package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_141 {
    private final Production62_141 production = new Production62_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}