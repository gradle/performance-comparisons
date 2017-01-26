package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_199 {
    private final Production10_199 production = new Production10_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}