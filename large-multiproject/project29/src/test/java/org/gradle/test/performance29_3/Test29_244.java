package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_244 {
    private final Production29_244 production = new Production29_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}