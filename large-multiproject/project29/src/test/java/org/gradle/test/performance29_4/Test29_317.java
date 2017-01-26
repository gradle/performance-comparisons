package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_317 {
    private final Production29_317 production = new Production29_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}