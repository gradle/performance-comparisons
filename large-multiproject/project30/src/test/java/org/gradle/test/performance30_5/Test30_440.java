package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_440 {
    private final Production30_440 production = new Production30_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}