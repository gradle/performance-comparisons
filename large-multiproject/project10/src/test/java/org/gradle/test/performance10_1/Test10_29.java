package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_29 {
    private final Production10_29 production = new Production10_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}