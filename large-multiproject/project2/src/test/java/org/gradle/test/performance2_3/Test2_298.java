package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_298 {
    private final Production2_298 production = new Production2_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}