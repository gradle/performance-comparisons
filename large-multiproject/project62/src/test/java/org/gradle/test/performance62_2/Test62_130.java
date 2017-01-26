package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_130 {
    private final Production62_130 production = new Production62_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}