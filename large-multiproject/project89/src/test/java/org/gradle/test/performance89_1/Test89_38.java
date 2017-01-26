package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_38 {
    private final Production89_38 production = new Production89_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}