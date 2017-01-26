package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_220 {
    private final Production27_220 production = new Production27_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}