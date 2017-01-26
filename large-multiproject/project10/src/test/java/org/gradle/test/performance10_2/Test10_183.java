package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_183 {
    private final Production10_183 production = new Production10_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}