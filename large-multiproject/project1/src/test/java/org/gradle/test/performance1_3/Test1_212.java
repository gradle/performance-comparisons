package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_212 {
    private final Production1_212 production = new Production1_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}