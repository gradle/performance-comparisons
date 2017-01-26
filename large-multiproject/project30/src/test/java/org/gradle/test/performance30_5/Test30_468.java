package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_468 {
    private final Production30_468 production = new Production30_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}