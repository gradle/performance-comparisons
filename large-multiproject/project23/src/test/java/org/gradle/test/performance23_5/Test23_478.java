package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_478 {
    private final Production23_478 production = new Production23_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}