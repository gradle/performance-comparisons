package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_72 {
    private final Production10_72 production = new Production10_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}