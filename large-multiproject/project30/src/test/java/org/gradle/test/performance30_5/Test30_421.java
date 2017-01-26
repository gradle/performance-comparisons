package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_421 {
    private final Production30_421 production = new Production30_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}