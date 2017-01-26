package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_403 {
    private final Production62_403 production = new Production62_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}