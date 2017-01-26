package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_95 {
    private final Production29_95 production = new Production29_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}