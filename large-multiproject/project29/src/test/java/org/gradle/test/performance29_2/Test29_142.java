package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_142 {
    private final Production29_142 production = new Production29_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}