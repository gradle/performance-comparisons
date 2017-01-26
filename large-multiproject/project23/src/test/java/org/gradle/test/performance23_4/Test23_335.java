package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_335 {
    private final Production23_335 production = new Production23_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}