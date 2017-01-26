package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_230 {
    private final Production60_230 production = new Production60_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}