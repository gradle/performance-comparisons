package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_47 {
    private final Production7_47 production = new Production7_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}