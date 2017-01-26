package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_266 {
    private final Production10_266 production = new Production10_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}