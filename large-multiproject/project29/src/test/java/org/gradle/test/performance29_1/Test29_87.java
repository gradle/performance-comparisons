package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_87 {
    private final Production29_87 production = new Production29_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}