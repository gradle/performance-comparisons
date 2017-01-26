package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_245 {
    private final Production23_245 production = new Production23_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}