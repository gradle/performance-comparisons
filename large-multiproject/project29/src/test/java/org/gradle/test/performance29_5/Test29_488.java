package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_488 {
    private final Production29_488 production = new Production29_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}