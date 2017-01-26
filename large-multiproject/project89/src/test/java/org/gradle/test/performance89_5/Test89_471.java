package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_471 {
    private final Production89_471 production = new Production89_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}