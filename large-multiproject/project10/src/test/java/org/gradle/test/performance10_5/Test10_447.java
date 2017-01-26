package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_447 {
    private final Production10_447 production = new Production10_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}