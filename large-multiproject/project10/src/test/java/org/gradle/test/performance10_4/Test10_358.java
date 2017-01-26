package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_358 {
    private final Production10_358 production = new Production10_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}