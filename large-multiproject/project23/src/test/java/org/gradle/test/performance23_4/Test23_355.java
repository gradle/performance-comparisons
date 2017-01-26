package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_355 {
    private final Production23_355 production = new Production23_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}