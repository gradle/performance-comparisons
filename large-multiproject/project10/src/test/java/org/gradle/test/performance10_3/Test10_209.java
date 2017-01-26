package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_209 {
    private final Production10_209 production = new Production10_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}