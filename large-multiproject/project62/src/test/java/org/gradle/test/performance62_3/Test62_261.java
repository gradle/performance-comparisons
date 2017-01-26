package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_261 {
    private final Production62_261 production = new Production62_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}