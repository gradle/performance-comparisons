package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_136 {
    private final Production29_136 production = new Production29_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}