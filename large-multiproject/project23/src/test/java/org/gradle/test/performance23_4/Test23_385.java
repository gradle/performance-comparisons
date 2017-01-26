package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_385 {
    private final Production23_385 production = new Production23_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}