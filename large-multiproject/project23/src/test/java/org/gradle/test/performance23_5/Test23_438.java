package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_438 {
    private final Production23_438 production = new Production23_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}