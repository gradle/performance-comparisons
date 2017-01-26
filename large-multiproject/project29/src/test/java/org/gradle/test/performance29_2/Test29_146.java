package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_146 {
    private final Production29_146 production = new Production29_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}