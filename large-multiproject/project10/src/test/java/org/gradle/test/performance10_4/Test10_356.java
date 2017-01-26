package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_356 {
    private final Production10_356 production = new Production10_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}