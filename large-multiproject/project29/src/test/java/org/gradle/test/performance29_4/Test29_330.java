package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_330 {
    private final Production29_330 production = new Production29_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}