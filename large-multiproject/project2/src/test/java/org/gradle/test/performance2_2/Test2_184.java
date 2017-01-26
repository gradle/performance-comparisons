package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_184 {
    private final Production2_184 production = new Production2_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}