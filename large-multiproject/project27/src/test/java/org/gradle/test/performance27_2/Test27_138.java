package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_138 {
    private final Production27_138 production = new Production27_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}