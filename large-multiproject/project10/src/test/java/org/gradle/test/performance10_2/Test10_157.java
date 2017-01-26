package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_157 {
    private final Production10_157 production = new Production10_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}