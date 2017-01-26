package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_118 {
    private final Production62_118 production = new Production62_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}