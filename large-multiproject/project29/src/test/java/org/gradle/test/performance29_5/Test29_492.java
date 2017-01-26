package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_492 {
    private final Production29_492 production = new Production29_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}