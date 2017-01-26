package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_495 {
    private final Production1_495 production = new Production1_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}