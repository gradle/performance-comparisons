package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_29 {
    private final Production1_29 production = new Production1_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}