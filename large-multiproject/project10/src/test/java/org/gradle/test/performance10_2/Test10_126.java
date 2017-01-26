package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_126 {
    private final Production10_126 production = new Production10_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}