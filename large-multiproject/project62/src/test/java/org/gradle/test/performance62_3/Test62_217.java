package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_217 {
    private final Production62_217 production = new Production62_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}