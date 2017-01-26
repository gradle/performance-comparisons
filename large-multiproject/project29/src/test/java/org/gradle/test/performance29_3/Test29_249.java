package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_249 {
    private final Production29_249 production = new Production29_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}