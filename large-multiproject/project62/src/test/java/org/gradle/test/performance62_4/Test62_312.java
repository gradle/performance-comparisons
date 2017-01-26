package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_312 {
    private final Production62_312 production = new Production62_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}