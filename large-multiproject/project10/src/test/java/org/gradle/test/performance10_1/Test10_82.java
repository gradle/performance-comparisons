package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_82 {
    private final Production10_82 production = new Production10_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}