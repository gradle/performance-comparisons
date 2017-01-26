package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_70 {
    private final Production62_70 production = new Production62_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}