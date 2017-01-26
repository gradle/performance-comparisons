package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_237 {
    private final Production29_237 production = new Production29_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}