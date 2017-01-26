package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_294 {
    private final Production10_294 production = new Production10_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}