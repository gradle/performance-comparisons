package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_257 {
    private final Production10_257 production = new Production10_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}