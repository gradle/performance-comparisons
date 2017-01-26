package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_200 {
    private final Production89_200 production = new Production89_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}