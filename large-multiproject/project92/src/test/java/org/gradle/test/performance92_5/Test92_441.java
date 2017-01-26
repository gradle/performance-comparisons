package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_441 {
    private final Production92_441 production = new Production92_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}