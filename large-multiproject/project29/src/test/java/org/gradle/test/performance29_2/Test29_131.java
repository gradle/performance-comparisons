package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_131 {
    private final Production29_131 production = new Production29_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}