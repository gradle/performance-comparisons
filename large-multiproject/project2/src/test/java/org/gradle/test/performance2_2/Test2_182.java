package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_182 {
    private final Production2_182 production = new Production2_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}