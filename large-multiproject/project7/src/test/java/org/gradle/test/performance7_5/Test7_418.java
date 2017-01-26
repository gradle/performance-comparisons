package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_418 {
    private final Production7_418 production = new Production7_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}