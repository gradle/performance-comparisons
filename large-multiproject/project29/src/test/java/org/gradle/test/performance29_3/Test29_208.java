package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_208 {
    private final Production29_208 production = new Production29_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}