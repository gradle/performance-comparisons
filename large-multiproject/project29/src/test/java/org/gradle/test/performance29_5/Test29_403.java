package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_403 {
    private final Production29_403 production = new Production29_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}