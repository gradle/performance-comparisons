package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_122 {
    private final Production62_122 production = new Production62_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}