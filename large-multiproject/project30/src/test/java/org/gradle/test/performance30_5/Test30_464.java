package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_464 {
    private final Production30_464 production = new Production30_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}