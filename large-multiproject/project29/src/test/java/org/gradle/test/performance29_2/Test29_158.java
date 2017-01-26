package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_158 {
    private final Production29_158 production = new Production29_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}