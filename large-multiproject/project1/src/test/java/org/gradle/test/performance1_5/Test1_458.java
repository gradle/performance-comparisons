package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_458 {
    private final Production1_458 production = new Production1_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}