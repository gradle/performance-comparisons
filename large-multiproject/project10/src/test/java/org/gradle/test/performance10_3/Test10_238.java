package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_238 {
    private final Production10_238 production = new Production10_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}