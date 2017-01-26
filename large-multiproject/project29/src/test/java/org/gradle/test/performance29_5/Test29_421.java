package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_421 {
    private final Production29_421 production = new Production29_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}