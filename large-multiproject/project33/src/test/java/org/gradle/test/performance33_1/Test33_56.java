package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_56 {
    private final Production33_56 production = new Production33_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}