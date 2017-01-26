package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_53 {
    private final Production89_53 production = new Production89_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}