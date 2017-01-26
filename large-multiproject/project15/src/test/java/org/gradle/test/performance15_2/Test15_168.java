package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_168 {
    private final Production15_168 production = new Production15_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}