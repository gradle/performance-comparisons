package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_202 {
    private final Production10_202 production = new Production10_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}