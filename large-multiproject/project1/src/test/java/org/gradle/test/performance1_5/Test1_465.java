package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_465 {
    private final Production1_465 production = new Production1_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}