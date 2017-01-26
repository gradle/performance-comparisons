package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_230 {
    private final Production24_230 production = new Production24_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}