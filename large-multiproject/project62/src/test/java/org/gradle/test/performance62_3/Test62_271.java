package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_271 {
    private final Production62_271 production = new Production62_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}