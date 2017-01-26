package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_391 {
    private final Production23_391 production = new Production23_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}