package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_170 {
    private final Production29_170 production = new Production29_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}