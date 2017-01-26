package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_484 {
    private final Production89_484 production = new Production89_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}