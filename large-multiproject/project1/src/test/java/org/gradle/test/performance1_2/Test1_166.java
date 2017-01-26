package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_166 {
    private final Production1_166 production = new Production1_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}