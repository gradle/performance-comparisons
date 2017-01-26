package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_462 {
    private final Production29_462 production = new Production29_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}