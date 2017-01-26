package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_149 {
    private final Production29_149 production = new Production29_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}