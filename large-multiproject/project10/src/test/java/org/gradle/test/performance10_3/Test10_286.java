package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_286 {
    private final Production10_286 production = new Production10_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}