package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_68 {
    private final Production10_68 production = new Production10_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}