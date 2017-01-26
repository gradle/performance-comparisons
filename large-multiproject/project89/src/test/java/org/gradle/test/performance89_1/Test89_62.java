package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_62 {
    private final Production89_62 production = new Production89_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}