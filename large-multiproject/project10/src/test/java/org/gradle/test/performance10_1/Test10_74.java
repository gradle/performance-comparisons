package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_74 {
    private final Production10_74 production = new Production10_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}