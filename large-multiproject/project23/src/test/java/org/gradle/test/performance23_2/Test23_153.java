package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_153 {
    private final Production23_153 production = new Production23_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}