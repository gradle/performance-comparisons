package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_276 {
    private final Production62_276 production = new Production62_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}