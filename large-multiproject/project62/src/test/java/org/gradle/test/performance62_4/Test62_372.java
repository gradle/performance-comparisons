package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_372 {
    private final Production62_372 production = new Production62_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}