package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_252 {
    private final Production49_252 production = new Production49_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}