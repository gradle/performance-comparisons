package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_371 {
    private final Production30_371 production = new Production30_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}