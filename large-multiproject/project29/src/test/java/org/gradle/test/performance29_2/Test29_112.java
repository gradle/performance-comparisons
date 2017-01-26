package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_112 {
    private final Production29_112 production = new Production29_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}