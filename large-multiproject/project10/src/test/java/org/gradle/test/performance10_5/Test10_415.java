package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_415 {
    private final Production10_415 production = new Production10_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}