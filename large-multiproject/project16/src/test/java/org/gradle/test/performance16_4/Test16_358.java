package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_358 {
    private final Production16_358 production = new Production16_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}