package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_107 {
    private final Production10_107 production = new Production10_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}