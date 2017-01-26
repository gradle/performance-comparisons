package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_16 {
    private final Production62_16 production = new Production62_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}