package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_391 {
    private final Production2_391 production = new Production2_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}