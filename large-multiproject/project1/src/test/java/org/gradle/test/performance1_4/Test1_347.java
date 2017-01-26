package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_347 {
    private final Production1_347 production = new Production1_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}