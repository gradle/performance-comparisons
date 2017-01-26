package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_19 {
    private final Production29_19 production = new Production29_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}