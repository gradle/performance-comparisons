package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_313 {
    private final Production29_313 production = new Production29_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}