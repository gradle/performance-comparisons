package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_340 {
    private final Production62_340 production = new Production62_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}