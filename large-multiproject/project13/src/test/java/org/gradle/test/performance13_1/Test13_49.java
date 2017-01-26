package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_49 {
    private final Production13_49 production = new Production13_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}