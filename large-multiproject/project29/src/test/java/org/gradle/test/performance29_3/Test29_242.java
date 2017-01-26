package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_242 {
    private final Production29_242 production = new Production29_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}