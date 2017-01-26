package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_31 {
    private final Production7_31 production = new Production7_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}