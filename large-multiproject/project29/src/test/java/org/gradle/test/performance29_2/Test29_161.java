package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_161 {
    private final Production29_161 production = new Production29_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}