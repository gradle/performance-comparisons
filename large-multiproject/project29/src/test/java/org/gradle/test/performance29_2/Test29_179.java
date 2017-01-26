package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_179 {
    private final Production29_179 production = new Production29_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}