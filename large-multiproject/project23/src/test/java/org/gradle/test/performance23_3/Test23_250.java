package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_250 {
    private final Production23_250 production = new Production23_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}