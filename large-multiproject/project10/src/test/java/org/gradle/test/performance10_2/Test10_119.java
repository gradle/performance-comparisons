package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_119 {
    private final Production10_119 production = new Production10_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}