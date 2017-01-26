package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_418 {
    private final Production92_418 production = new Production92_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}