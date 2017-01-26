package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_6 {
    private final Production29_6 production = new Production29_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}