package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_254 {
    private final Production29_254 production = new Production29_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}