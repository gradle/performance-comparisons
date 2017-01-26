package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_134 {
    private final Production10_134 production = new Production10_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}