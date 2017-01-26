package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_74 {
    private final Production27_74 production = new Production27_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}