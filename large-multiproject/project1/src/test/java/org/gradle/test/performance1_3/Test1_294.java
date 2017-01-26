package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_294 {
    private final Production1_294 production = new Production1_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}