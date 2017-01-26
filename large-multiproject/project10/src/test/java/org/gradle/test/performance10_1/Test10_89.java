package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_89 {
    private final Production10_89 production = new Production10_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}