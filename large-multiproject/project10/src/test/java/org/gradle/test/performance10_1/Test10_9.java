package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_9 {
    private final Production10_9 production = new Production10_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}