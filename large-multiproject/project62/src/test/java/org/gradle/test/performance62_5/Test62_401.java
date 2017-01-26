package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_401 {
    private final Production62_401 production = new Production62_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}