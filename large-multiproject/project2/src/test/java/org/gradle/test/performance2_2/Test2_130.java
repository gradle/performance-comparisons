package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_130 {
    private final Production2_130 production = new Production2_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}