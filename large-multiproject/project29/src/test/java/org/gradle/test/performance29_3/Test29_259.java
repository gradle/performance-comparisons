package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_259 {
    private final Production29_259 production = new Production29_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}