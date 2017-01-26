package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_100 {
    private final Production10_100 production = new Production10_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}