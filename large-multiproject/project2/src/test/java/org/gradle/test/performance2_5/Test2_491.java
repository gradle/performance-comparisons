package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_491 {
    private final Production2_491 production = new Production2_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}