package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_168 {
    private final Production27_168 production = new Production27_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}