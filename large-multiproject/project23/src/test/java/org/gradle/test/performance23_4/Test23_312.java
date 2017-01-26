package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_312 {
    private final Production23_312 production = new Production23_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}