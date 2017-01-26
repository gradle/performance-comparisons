package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_226 {
    private final Production29_226 production = new Production29_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}