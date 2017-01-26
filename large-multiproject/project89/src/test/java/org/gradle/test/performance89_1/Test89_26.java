package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_26 {
    private final Production89_26 production = new Production89_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}