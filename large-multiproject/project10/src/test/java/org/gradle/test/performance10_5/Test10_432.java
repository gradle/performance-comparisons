package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_432 {
    private final Production10_432 production = new Production10_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}