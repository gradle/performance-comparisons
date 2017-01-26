package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_128 {
    private final Production23_128 production = new Production23_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}