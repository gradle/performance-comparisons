package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_388 {
    private final Production1_388 production = new Production1_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}