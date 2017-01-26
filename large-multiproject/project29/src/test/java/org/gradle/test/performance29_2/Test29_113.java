package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_113 {
    private final Production29_113 production = new Production29_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}