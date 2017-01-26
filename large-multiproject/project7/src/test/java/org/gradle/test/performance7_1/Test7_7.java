package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_7 {
    private final Production7_7 production = new Production7_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}