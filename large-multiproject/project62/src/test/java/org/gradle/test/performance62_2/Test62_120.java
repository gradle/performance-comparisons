package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_120 {
    private final Production62_120 production = new Production62_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}