package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_334 {
    private final Production62_334 production = new Production62_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}