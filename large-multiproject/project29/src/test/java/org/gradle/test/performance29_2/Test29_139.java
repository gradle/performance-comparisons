package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_139 {
    private final Production29_139 production = new Production29_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}