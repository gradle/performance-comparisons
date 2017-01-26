package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_75 {
    private final Production10_75 production = new Production10_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}