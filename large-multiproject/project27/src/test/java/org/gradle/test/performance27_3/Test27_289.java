package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_289 {
    private final Production27_289 production = new Production27_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}