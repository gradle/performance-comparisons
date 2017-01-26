package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_196 {
    private final Production10_196 production = new Production10_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}