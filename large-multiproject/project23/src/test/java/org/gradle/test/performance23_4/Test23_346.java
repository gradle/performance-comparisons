package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_346 {
    private final Production23_346 production = new Production23_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}