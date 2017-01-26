package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_230 {
    private final Production85_230 production = new Production85_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}