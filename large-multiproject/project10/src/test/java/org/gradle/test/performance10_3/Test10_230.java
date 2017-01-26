package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_230 {
    private final Production10_230 production = new Production10_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}