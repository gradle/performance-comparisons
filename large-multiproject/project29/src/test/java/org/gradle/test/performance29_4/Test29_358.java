package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_358 {
    private final Production29_358 production = new Production29_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}