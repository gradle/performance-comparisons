package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_435 {
    private final Production29_435 production = new Production29_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}