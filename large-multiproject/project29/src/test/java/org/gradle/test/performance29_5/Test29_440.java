package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_440 {
    private final Production29_440 production = new Production29_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}