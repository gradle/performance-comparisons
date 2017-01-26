package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_271 {
    private final Production99_271 production = new Production99_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}