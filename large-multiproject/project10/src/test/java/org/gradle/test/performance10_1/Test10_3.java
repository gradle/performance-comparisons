package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_3 {
    private final Production10_3 production = new Production10_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}