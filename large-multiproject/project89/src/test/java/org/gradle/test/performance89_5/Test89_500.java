package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_500 {
    private final Production89_500 production = new Production89_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}