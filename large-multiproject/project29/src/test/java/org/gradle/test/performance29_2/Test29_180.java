package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_180 {
    private final Production29_180 production = new Production29_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}