package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_258 {
    private final Production62_258 production = new Production62_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}