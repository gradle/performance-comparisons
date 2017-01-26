package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_471 {
    private final Production29_471 production = new Production29_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}