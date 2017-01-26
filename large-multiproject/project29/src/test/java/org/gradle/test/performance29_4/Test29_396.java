package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_396 {
    private final Production29_396 production = new Production29_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}