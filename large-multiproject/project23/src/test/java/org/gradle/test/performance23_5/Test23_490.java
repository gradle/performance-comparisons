package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_490 {
    private final Production23_490 production = new Production23_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}