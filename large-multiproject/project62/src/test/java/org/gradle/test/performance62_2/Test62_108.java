package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_108 {
    private final Production62_108 production = new Production62_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}