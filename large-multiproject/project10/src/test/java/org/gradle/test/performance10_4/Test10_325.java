package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_325 {
    private final Production10_325 production = new Production10_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}