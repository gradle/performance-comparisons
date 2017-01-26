package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_220 {
    private final Production29_220 production = new Production29_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}