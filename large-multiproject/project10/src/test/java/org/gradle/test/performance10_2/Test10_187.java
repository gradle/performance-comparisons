package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_187 {
    private final Production10_187 production = new Production10_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}