package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_195 {
    private final Production1_195 production = new Production1_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}