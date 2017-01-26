package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_345 {
    private final Production62_345 production = new Production62_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}