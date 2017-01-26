package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_324 {
    private final Production62_324 production = new Production62_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}