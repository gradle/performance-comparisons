package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_228 {
    private final Production10_228 production = new Production10_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}