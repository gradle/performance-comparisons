package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_252 {
    private final Production7_252 production = new Production7_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}