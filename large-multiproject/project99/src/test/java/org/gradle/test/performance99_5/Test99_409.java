package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_409 {
    private final Production99_409 production = new Production99_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}