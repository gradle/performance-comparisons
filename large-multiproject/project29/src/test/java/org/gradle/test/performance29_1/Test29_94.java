package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_94 {
    private final Production29_94 production = new Production29_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}