package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_96 {
    private final Production10_96 production = new Production10_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}