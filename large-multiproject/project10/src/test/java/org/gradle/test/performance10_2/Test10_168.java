package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_168 {
    private final Production10_168 production = new Production10_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}