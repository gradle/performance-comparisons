package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_264 {
    private final Production27_264 production = new Production27_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}