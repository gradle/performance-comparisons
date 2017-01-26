package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_60 {
    private final Production29_60 production = new Production29_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}