package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_140 {
    private final Production7_140 production = new Production7_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}