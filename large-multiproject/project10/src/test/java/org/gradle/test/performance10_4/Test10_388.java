package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_388 {
    private final Production10_388 production = new Production10_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}