package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_322 {
    private final Production29_322 production = new Production29_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}