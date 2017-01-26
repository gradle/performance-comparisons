package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_337 {
    private final Production29_337 production = new Production29_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}