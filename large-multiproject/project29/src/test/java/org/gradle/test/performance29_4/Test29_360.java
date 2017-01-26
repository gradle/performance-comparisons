package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_360 {
    private final Production29_360 production = new Production29_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}