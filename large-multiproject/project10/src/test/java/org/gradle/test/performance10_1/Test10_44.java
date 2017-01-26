package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_44 {
    private final Production10_44 production = new Production10_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}