package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_297 {
    private final Production1_297 production = new Production1_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}