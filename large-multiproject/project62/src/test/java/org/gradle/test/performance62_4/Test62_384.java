package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_384 {
    private final Production62_384 production = new Production62_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}