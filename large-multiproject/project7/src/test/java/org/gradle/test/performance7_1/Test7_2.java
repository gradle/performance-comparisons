package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_2 {
    private final Production7_2 production = new Production7_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}