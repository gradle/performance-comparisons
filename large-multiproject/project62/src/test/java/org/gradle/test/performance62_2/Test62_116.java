package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_116 {
    private final Production62_116 production = new Production62_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}