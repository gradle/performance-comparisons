package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_412 {
    private final Production2_412 production = new Production2_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}