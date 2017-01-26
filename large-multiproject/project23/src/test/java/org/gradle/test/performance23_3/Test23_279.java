package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_279 {
    private final Production23_279 production = new Production23_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}