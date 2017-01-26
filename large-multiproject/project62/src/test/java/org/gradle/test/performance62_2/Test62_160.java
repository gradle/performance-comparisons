package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_160 {
    private final Production62_160 production = new Production62_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}