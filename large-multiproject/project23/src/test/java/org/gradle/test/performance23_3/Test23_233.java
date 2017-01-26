package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_233 {
    private final Production23_233 production = new Production23_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}