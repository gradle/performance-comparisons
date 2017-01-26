package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_201 {
    private final Production19_201 production = new Production19_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}