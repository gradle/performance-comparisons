package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_61 {
    private final Production7_61 production = new Production7_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}