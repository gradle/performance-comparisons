package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_89 {
    private final Production1_89 production = new Production1_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}