package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_277 {
    private final Production23_277 production = new Production23_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}