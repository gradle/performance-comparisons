package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_38 {
    private final Production10_38 production = new Production10_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}