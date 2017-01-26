package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_145 {
    private final Production10_145 production = new Production10_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}