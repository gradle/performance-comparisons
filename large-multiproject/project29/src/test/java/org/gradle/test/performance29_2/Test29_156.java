package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_156 {
    private final Production29_156 production = new Production29_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}