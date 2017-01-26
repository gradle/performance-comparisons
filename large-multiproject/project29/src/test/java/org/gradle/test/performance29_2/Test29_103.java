package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_103 {
    private final Production29_103 production = new Production29_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}