package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_39 {
    private final Production89_39 production = new Production89_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}