package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_143 {
    private final Production29_143 production = new Production29_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}