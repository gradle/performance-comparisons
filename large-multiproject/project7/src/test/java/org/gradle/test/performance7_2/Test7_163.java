package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_163 {
    private final Production7_163 production = new Production7_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}