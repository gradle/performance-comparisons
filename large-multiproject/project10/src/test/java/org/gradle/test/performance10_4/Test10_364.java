package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_364 {
    private final Production10_364 production = new Production10_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}