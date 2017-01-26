package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_151 {
    private final Production29_151 production = new Production29_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}