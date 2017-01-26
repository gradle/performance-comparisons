package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_358 {
    private final Production4_358 production = new Production4_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}