package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_267 {
    private final Production1_267 production = new Production1_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}