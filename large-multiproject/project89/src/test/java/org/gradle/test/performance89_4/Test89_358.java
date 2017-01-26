package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_358 {
    private final Production89_358 production = new Production89_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}