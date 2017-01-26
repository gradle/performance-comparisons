package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_157 {
    private final Production27_157 production = new Production27_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}