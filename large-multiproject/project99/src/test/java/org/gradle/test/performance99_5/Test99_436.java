package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_436 {
    private final Production99_436 production = new Production99_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}