package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_41 {
    private final Production1_41 production = new Production1_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}