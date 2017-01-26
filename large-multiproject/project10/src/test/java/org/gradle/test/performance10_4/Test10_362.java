package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_362 {
    private final Production10_362 production = new Production10_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}