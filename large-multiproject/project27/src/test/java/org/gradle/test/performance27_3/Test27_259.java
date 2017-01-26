package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_259 {
    private final Production27_259 production = new Production27_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}