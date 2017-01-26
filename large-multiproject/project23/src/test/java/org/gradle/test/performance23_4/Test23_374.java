package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_374 {
    private final Production23_374 production = new Production23_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}