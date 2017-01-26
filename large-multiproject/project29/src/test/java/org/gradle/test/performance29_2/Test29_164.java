package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_164 {
    private final Production29_164 production = new Production29_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}