package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_332 {
    private final Production23_332 production = new Production23_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}