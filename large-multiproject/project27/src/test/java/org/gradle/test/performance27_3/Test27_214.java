package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_214 {
    private final Production27_214 production = new Production27_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}