package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_375 {
    private final Production23_375 production = new Production23_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}