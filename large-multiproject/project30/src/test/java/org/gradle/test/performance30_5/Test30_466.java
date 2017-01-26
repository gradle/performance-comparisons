package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_466 {
    private final Production30_466 production = new Production30_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}