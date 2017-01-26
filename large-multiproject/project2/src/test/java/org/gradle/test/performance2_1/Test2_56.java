package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_56 {
    private final Production2_56 production = new Production2_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}