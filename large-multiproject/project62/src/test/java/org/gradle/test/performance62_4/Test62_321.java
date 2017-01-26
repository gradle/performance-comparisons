package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_321 {
    private final Production62_321 production = new Production62_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}