package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_466 {
    private final Production7_466 production = new Production7_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}