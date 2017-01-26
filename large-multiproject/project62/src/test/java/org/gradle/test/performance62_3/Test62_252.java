package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_252 {
    private final Production62_252 production = new Production62_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}