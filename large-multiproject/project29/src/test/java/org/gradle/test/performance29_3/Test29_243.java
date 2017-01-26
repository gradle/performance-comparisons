package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_243 {
    private final Production29_243 production = new Production29_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}