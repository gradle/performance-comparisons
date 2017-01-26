package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_467 {
    private final Production62_467 production = new Production62_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}