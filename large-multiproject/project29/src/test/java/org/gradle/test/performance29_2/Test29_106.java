package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_106 {
    private final Production29_106 production = new Production29_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}