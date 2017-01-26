package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_176 {
    private final Production29_176 production = new Production29_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}