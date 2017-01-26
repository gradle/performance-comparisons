package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_482 {
    private final Production29_482 production = new Production29_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}