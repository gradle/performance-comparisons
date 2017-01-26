package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_184 {
    private final Production29_184 production = new Production29_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}