package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_109 {
    private final Production10_109 production = new Production10_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}