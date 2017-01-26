package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_211 {
    private final Production23_211 production = new Production23_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}