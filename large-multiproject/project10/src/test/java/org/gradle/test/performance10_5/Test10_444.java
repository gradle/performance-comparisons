package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_444 {
    private final Production10_444 production = new Production10_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}