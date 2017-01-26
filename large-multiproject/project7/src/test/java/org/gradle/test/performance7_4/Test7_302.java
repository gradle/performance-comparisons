package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_302 {
    private final Production7_302 production = new Production7_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}