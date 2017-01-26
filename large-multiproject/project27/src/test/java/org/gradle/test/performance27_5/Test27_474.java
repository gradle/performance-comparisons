package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_474 {
    private final Production27_474 production = new Production27_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}