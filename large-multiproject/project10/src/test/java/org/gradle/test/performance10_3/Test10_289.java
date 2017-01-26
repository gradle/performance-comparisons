package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_289 {
    private final Production10_289 production = new Production10_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}