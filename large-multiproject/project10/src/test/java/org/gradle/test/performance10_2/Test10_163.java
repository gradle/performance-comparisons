package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_163 {
    private final Production10_163 production = new Production10_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}