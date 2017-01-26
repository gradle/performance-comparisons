package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_442 {
    private final Production10_442 production = new Production10_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}