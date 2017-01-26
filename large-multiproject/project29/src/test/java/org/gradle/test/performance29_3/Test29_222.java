package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_222 {
    private final Production29_222 production = new Production29_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}