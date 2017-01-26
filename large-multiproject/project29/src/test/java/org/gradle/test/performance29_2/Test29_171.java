package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_171 {
    private final Production29_171 production = new Production29_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}