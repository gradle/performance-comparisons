package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_195 {
    private final Production89_195 production = new Production89_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}