package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_166 {
    private final Production15_166 production = new Production15_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}