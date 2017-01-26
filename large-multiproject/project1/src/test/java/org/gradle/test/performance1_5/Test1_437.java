package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_437 {
    private final Production1_437 production = new Production1_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}