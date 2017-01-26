package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_241 {
    private final Production10_241 production = new Production10_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}