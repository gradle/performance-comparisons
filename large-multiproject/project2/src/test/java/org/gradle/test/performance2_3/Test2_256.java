package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_256 {
    private final Production2_256 production = new Production2_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}