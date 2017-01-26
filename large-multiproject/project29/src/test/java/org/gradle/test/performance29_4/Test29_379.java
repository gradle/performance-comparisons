package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_379 {
    private final Production29_379 production = new Production29_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}