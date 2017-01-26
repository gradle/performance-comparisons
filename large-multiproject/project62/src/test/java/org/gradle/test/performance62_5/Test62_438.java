package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_438 {
    private final Production62_438 production = new Production62_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}