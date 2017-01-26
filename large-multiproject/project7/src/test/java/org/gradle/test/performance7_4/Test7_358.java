package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_358 {
    private final Production7_358 production = new Production7_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}