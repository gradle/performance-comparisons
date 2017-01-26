package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_127 {
    private final Production7_127 production = new Production7_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}