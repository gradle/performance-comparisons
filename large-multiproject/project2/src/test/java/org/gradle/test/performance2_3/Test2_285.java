package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_285 {
    private final Production2_285 production = new Production2_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}