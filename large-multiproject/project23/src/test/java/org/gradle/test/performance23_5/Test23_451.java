package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_451 {
    private final Production23_451 production = new Production23_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}