package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_495 {
    private final Production10_495 production = new Production10_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}