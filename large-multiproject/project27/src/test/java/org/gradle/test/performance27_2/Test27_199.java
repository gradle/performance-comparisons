package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_199 {
    private final Production27_199 production = new Production27_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}