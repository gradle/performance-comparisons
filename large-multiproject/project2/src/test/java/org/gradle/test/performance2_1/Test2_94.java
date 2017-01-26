package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_94 {
    private final Production2_94 production = new Production2_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}