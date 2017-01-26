package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_230 {
    private final Production49_230 production = new Production49_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}