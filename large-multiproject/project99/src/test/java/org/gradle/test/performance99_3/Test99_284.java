package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_284 {
    private final Production99_284 production = new Production99_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}