package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_284 {
    private final Production2_284 production = new Production2_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}