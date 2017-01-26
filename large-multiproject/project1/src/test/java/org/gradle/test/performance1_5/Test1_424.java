package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_424 {
    private final Production1_424 production = new Production1_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}