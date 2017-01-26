package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_192 {
    private final Production29_192 production = new Production29_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}