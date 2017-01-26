package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_456 {
    private final Production23_456 production = new Production23_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}