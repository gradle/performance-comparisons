package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_252 {
    private final Production15_252 production = new Production15_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}