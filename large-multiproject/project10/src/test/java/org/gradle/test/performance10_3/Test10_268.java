package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_268 {
    private final Production10_268 production = new Production10_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}