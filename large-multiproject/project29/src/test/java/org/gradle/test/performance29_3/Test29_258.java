package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_258 {
    private final Production29_258 production = new Production29_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}