package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_114 {
    private final Production29_114 production = new Production29_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}