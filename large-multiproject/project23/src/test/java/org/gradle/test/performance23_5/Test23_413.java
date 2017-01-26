package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_413 {
    private final Production23_413 production = new Production23_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}