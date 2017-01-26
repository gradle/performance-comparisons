package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_298 {
    private final Production23_298 production = new Production23_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}