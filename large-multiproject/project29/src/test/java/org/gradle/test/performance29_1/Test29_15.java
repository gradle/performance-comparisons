package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_15 {
    private final Production29_15 production = new Production29_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}