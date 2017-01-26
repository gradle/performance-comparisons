package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_175 {
    private final Production29_175 production = new Production29_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}