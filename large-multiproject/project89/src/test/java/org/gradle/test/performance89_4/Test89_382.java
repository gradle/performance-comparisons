package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_382 {
    private final Production89_382 production = new Production89_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}