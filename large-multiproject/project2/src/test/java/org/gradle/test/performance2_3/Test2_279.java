package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_279 {
    private final Production2_279 production = new Production2_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}