package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_247 {
    private final Production62_247 production = new Production62_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}