package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_177 {
    private final Production29_177 production = new Production29_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}