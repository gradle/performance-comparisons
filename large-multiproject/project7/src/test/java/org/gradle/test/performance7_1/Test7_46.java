package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_46 {
    private final Production7_46 production = new Production7_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}