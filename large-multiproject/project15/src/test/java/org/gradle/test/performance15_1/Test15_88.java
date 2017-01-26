package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_88 {
    private final Production15_88 production = new Production15_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}