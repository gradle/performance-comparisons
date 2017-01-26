package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_14 {
    private final Production10_14 production = new Production10_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}