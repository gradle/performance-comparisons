package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_414 {
    private final Production19_414 production = new Production19_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}