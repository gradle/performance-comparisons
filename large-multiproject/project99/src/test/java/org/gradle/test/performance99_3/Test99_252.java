package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_252 {
    private final Production99_252 production = new Production99_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}