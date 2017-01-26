package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_191 {
    private final Production27_191 production = new Production27_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}