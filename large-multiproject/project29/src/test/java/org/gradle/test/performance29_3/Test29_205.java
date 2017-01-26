package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_205 {
    private final Production29_205 production = new Production29_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}