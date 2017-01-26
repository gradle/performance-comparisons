package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_181 {
    private final Production10_181 production = new Production10_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}