package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_391 {
    private final Production62_391 production = new Production62_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}