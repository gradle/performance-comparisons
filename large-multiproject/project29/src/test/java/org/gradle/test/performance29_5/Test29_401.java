package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_401 {
    private final Production29_401 production = new Production29_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}