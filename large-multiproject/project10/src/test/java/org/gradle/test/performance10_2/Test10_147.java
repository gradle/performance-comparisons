package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_147 {
    private final Production10_147 production = new Production10_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}