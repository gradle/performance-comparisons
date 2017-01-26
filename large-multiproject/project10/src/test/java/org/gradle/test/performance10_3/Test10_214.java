package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_214 {
    private final Production10_214 production = new Production10_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}