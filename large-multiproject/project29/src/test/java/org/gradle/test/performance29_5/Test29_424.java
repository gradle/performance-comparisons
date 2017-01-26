package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_424 {
    private final Production29_424 production = new Production29_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}