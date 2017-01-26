package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_172 {
    private final Production1_172 production = new Production1_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}