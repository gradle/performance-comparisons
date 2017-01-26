package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_301 {
    private final Production23_301 production = new Production23_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}