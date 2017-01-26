package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_230 {
    private final Production79_230 production = new Production79_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}