package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_41 {
    private final Production89_41 production = new Production89_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}