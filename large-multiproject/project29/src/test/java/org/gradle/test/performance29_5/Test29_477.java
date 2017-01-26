package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_477 {
    private final Production29_477 production = new Production29_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}