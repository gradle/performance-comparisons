package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_221 {
    private final Production62_221 production = new Production62_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}