package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_414 {
    private final Production2_414 production = new Production2_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}