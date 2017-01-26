package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_365 {
    private final Production29_365 production = new Production29_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}