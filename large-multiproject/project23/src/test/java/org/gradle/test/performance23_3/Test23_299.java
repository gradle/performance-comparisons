package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_299 {
    private final Production23_299 production = new Production23_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}