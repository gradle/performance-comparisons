package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_372 {
    private final Production23_372 production = new Production23_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}