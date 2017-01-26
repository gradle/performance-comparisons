package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_447 {
    private final Production29_447 production = new Production29_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}