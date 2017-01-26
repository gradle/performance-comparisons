package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_373 {
    private final Production29_373 production = new Production29_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}