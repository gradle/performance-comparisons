package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_343 {
    private final Production1_343 production = new Production1_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}