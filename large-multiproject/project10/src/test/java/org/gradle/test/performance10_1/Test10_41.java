package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_41 {
    private final Production10_41 production = new Production10_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}