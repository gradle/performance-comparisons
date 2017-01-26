package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_139 {
    private final Production10_139 production = new Production10_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}