package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_276 {
    private final Production99_276 production = new Production99_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}