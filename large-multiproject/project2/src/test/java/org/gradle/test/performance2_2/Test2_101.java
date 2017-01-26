package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_101 {
    private final Production2_101 production = new Production2_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}