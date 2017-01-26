package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_91 {
    private final Production10_91 production = new Production10_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}