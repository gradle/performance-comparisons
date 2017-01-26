package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_187 {
    private final Production29_187 production = new Production29_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}