package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_476 {
    private final Production29_476 production = new Production29_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}