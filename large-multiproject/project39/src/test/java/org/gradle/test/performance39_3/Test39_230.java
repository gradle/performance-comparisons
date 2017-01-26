package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_230 {
    private final Production39_230 production = new Production39_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}