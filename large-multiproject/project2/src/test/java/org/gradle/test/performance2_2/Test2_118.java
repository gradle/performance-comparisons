package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_118 {
    private final Production2_118 production = new Production2_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}