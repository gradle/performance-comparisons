package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_452 {
    private final Production62_452 production = new Production62_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}