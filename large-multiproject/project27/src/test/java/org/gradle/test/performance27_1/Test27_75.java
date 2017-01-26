package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_75 {
    private final Production27_75 production = new Production27_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}