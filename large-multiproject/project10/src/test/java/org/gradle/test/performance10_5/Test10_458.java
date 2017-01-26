package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_458 {
    private final Production10_458 production = new Production10_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}