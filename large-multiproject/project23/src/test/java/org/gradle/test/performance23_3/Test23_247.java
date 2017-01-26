package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_247 {
    private final Production23_247 production = new Production23_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}