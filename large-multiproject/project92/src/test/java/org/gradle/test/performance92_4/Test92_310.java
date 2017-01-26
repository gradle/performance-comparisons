package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_310 {
    private final Production92_310 production = new Production92_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}