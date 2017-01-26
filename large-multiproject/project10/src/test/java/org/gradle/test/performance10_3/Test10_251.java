package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_251 {
    private final Production10_251 production = new Production10_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}