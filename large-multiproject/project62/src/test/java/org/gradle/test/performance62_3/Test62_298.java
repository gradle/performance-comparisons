package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_298 {
    private final Production62_298 production = new Production62_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}