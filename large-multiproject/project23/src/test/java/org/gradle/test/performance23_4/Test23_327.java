package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_327 {
    private final Production23_327 production = new Production23_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}