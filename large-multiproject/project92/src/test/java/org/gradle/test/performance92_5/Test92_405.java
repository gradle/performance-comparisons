package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_405 {
    private final Production92_405 production = new Production92_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}