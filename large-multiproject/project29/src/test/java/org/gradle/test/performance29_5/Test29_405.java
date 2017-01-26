package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_405 {
    private final Production29_405 production = new Production29_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}