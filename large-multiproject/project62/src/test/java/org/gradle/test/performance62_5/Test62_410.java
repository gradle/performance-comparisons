package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_410 {
    private final Production62_410 production = new Production62_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}