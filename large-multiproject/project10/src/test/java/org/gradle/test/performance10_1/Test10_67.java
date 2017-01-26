package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_67 {
    private final Production10_67 production = new Production10_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}