package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_7 {
    private final Production29_7 production = new Production29_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}