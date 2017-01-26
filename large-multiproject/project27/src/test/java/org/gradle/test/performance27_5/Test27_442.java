package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_442 {
    private final Production27_442 production = new Production27_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}