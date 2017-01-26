package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_368 {
    private final Production34_368 production = new Production34_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}