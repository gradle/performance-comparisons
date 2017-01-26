package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_209 {
    private final Production1_209 production = new Production1_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}