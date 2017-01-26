package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_435 {
    private final Production92_435 production = new Production92_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}