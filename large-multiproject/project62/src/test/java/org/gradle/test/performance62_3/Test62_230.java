package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_230 {
    private final Production62_230 production = new Production62_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}