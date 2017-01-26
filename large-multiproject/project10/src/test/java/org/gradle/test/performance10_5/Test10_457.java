package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_457 {
    private final Production10_457 production = new Production10_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}