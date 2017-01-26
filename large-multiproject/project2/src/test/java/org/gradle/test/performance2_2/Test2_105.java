package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_105 {
    private final Production2_105 production = new Production2_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}