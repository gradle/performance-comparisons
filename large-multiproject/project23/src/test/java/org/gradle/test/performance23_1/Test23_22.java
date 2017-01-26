package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_22 {
    private final Production23_22 production = new Production23_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}