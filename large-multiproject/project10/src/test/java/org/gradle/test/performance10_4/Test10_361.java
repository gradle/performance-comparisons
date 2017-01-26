package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_361 {
    private final Production10_361 production = new Production10_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}