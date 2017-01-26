package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_493 {
    private final Production23_493 production = new Production23_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}