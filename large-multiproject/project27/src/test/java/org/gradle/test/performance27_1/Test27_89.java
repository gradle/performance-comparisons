package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_89 {
    private final Production27_89 production = new Production27_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}