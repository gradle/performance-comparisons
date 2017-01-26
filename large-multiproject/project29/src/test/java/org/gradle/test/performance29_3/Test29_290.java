package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_290 {
    private final Production29_290 production = new Production29_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}