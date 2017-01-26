package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_129 {
    private final Production29_129 production = new Production29_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}