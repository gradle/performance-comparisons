package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_15 {
    private final Production62_15 production = new Production62_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}