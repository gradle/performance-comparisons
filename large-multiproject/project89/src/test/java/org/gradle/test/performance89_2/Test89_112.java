package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_112 {
    private final Production89_112 production = new Production89_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}