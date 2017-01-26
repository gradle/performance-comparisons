package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_165 {
    private final Production29_165 production = new Production29_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}