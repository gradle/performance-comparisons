package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_45 {
    private final Production13_45 production = new Production13_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}