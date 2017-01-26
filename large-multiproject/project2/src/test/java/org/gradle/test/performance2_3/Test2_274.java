package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_274 {
    private final Production2_274 production = new Production2_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}