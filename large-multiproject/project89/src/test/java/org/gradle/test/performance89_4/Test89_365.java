package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_365 {
    private final Production89_365 production = new Production89_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}