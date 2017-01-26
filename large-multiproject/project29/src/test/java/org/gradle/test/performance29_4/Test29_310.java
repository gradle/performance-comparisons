package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_310 {
    private final Production29_310 production = new Production29_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}