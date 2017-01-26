package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_272 {
    private final Production2_272 production = new Production2_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}