package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_411 {
    private final Production23_411 production = new Production23_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}