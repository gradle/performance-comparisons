package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_61 {
    private final Production89_61 production = new Production89_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}