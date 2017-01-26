package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_175 {
    private final Production10_175 production = new Production10_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}