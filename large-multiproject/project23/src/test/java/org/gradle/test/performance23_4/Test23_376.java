package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_376 {
    private final Production23_376 production = new Production23_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}