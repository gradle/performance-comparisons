package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_16 {
    private final Production29_16 production = new Production29_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}