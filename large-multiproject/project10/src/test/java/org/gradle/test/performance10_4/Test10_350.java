package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_350 {
    private final Production10_350 production = new Production10_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}