package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_252 {
    private final Production24_252 production = new Production24_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}