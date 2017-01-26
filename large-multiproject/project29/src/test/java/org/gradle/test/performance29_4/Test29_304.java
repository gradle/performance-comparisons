package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_304 {
    private final Production29_304 production = new Production29_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}