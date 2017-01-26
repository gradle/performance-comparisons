package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_319 {
    private final Production23_319 production = new Production23_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}