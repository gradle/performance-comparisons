package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_230 {
    private final Production27_230 production = new Production27_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}