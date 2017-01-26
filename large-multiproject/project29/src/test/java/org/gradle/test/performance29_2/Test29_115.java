package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_115 {
    private final Production29_115 production = new Production29_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}