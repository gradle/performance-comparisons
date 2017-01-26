package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_358 {
    private final Production58_358 production = new Production58_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}