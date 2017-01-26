package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_37 {
    private final Production29_37 production = new Production29_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}