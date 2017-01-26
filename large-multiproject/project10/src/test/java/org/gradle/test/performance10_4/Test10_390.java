package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_390 {
    private final Production10_390 production = new Production10_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}