package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_365 {
    private final Production92_365 production = new Production92_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}