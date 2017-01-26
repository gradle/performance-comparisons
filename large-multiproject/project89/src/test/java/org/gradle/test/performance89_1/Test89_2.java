package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_2 {
    private final Production89_2 production = new Production89_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}