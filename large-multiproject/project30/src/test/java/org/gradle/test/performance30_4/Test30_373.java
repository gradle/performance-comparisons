package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_373 {
    private final Production30_373 production = new Production30_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}