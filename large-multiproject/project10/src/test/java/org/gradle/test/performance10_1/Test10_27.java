package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_27 {
    private final Production10_27 production = new Production10_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}