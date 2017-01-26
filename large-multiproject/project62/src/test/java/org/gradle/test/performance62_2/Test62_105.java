package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_105 {
    private final Production62_105 production = new Production62_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}