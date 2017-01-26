package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_340 {
    private final Production2_340 production = new Production2_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}