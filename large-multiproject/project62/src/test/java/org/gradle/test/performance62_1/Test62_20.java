package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_20 {
    private final Production62_20 production = new Production62_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}