package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_435 {
    private final Production10_435 production = new Production10_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}