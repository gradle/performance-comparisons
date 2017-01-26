package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_1 {
    private final Production29_1 production = new Production29_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}