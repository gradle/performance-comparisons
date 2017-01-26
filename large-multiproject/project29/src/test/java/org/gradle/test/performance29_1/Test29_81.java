package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_81 {
    private final Production29_81 production = new Production29_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}