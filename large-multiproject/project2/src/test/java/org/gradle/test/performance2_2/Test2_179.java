package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_179 {
    private final Production2_179 production = new Production2_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}