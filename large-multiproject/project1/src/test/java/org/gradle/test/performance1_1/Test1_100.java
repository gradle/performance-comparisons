package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_100 {
    private final Production1_100 production = new Production1_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}