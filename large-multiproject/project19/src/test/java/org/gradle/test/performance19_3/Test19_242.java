package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_242 {
    private final Production19_242 production = new Production19_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}