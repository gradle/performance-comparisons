package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_216 {
    private final Production10_216 production = new Production10_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}