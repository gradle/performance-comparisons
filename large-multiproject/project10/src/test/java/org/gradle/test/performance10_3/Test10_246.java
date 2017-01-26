package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_246 {
    private final Production10_246 production = new Production10_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}