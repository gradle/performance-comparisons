package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_497 {
    private final Production89_497 production = new Production89_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}