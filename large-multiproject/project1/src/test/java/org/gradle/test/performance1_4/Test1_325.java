package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_325 {
    private final Production1_325 production = new Production1_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}