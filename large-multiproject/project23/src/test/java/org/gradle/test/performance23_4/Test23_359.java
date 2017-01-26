package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_359 {
    private final Production23_359 production = new Production23_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}