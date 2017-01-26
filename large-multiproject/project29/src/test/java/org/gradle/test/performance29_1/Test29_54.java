package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_54 {
    private final Production29_54 production = new Production29_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}