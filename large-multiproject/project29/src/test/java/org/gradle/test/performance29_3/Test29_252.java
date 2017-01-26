package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_252 {
    private final Production29_252 production = new Production29_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}