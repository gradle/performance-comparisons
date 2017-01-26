package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_428 {
    private final Production2_428 production = new Production2_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}