package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_89 {
    private final Production15_89 production = new Production15_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}