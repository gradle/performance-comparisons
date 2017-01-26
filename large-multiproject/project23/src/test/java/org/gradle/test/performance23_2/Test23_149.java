package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_149 {
    private final Production23_149 production = new Production23_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}