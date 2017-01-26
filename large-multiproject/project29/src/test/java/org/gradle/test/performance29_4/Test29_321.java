package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_321 {
    private final Production29_321 production = new Production29_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}