package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_118 {
    private final Production29_118 production = new Production29_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}