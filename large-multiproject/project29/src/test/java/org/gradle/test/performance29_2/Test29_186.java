package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_186 {
    private final Production29_186 production = new Production29_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}