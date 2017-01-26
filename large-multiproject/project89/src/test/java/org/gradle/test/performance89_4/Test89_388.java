package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_388 {
    private final Production89_388 production = new Production89_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}