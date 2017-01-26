package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_358 {
    private final Production20_358 production = new Production20_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}