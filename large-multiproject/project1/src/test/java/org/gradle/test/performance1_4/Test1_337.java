package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_337 {
    private final Production1_337 production = new Production1_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}