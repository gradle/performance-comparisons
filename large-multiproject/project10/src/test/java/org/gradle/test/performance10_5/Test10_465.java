package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_465 {
    private final Production10_465 production = new Production10_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}