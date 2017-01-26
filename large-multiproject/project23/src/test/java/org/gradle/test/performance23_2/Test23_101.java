package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_101 {
    private final Production23_101 production = new Production23_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}