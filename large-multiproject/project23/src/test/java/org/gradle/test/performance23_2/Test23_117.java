package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_117 {
    private final Production23_117 production = new Production23_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}