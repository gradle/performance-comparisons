package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_64 {
    private final Production62_64 production = new Production62_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}