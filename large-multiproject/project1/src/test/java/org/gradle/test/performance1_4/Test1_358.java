package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_358 {
    private final Production1_358 production = new Production1_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}