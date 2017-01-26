package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_192 {
    private final Production62_192 production = new Production62_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}