package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_80 {
    private final Production1_80 production = new Production1_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}