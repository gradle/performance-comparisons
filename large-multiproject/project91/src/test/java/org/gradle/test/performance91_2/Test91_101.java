package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_101 {
    private final Production91_101 production = new Production91_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}