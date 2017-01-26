package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_11 {
    private final Production19_11 production = new Production19_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}