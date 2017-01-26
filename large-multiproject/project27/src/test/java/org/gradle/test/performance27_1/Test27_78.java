package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_78 {
    private final Production27_78 production = new Production27_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}