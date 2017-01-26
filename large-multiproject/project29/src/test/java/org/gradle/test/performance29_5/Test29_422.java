package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_422 {
    private final Production29_422 production = new Production29_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}