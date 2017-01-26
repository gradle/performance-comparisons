package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_121 {
    private final Production23_121 production = new Production23_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}