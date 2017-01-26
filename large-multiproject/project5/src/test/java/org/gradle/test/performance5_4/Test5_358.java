package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_358 {
    private final Production5_358 production = new Production5_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}