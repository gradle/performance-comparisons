package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_93 {
    private final Production15_93 production = new Production15_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}