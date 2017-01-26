package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_67 {
    private final Production27_67 production = new Production27_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}