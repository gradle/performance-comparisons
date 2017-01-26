package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_479 {
    private final Production29_479 production = new Production29_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}