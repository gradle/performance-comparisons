package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_306 {
    private final Production29_306 production = new Production29_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}