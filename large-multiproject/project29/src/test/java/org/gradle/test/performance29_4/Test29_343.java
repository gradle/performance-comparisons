package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_343 {
    private final Production29_343 production = new Production29_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}