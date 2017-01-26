package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_204 {
    private final Production29_204 production = new Production29_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}