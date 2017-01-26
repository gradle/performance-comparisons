package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_122 {
    private final Production29_122 production = new Production29_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}