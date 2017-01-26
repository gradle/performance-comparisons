package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_172 {
    private final Production10_172 production = new Production10_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}