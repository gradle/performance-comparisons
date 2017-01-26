package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_215 {
    private final Production10_215 production = new Production10_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}