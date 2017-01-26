package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_10 {
    private final Production89_10 production = new Production89_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}