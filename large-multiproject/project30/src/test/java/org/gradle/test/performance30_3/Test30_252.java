package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_252 {
    private final Production30_252 production = new Production30_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}