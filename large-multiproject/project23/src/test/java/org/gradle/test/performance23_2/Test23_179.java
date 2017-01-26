package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_179 {
    private final Production23_179 production = new Production23_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}