package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_275 {
    private final Production2_275 production = new Production2_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}