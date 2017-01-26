package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_102 {
    private final Production63_102 production = new Production63_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}