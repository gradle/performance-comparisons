package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_370 {
    private final Production62_370 production = new Production62_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}