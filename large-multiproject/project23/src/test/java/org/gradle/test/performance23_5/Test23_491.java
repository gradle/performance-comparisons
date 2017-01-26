package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_491 {
    private final Production23_491 production = new Production23_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}