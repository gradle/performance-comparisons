package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_69 {
    private final Production62_69 production = new Production62_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}