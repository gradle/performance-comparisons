package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_471 {
    private final Production92_471 production = new Production92_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}