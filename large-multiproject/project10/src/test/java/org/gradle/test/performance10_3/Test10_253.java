package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_253 {
    private final Production10_253 production = new Production10_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}