package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_389 {
    private final Production23_389 production = new Production23_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}