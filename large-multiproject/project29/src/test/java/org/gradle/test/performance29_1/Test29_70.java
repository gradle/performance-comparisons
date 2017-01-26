package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_70 {
    private final Production29_70 production = new Production29_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}