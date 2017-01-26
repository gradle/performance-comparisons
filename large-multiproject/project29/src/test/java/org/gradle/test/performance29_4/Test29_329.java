package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_329 {
    private final Production29_329 production = new Production29_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}