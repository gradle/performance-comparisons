package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_328 {
    private final Production2_328 production = new Production2_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}