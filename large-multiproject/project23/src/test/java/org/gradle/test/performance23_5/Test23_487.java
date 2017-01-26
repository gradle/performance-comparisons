package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_487 {
    private final Production23_487 production = new Production23_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}