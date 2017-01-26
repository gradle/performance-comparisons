package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_390 {
    private final Production89_390 production = new Production89_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}