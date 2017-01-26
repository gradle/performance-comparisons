package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_395 {
    private final Production1_395 production = new Production1_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}