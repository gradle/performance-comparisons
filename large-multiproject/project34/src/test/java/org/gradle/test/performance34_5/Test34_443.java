package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_443 {
    private final Production34_443 production = new Production34_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}