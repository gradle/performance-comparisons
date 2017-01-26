package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_66 {
    private final Production27_66 production = new Production27_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}