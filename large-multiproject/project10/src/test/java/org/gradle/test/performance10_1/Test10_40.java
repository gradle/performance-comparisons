package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_40 {
    private final Production10_40 production = new Production10_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}