package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_2 {
    private final Production10_2 production = new Production10_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}