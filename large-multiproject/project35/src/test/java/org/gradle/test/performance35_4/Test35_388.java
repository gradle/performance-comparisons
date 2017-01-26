package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_388 {
    private final Production35_388 production = new Production35_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}