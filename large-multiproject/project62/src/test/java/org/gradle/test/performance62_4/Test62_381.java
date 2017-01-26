package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_381 {
    private final Production62_381 production = new Production62_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}