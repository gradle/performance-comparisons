package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_360 {
    private final Production27_360 production = new Production27_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}