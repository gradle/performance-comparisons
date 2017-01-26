package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_193 {
    private final Production29_193 production = new Production29_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}