package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_124 {
    private final Production23_124 production = new Production23_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}