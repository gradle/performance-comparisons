package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_463 {
    private final Production62_463 production = new Production62_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}