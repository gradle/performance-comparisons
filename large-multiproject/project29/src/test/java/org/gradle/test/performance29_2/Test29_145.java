package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_145 {
    private final Production29_145 production = new Production29_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}