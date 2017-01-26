package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_56 {
    private final Production29_56 production = new Production29_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}