package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_137 {
    private final Production10_137 production = new Production10_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}