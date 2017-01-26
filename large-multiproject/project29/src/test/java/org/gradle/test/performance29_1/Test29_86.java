package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_86 {
    private final Production29_86 production = new Production29_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}