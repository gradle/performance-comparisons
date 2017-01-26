package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_40 {
    private final Production1_40 production = new Production1_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}