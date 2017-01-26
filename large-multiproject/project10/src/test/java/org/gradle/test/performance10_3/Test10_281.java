package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_281 {
    private final Production10_281 production = new Production10_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}