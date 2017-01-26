package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_201 {
    private final Production2_201 production = new Production2_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}