package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_195 {
    private final Production10_195 production = new Production10_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}