package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_6 {
    private final Production92_6 production = new Production92_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}