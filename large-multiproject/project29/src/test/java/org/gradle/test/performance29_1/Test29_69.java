package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_69 {
    private final Production29_69 production = new Production29_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}