package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_90 {
    private final Production62_90 production = new Production62_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}