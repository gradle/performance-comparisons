package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_102 {
    private final Production89_102 production = new Production89_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}