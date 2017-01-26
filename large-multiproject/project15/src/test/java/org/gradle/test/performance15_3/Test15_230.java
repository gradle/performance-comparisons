package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_230 {
    private final Production15_230 production = new Production15_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}