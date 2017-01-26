package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_468 {
    private final Production29_468 production = new Production29_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}