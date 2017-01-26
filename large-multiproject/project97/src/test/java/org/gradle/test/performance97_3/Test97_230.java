package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_230 {
    private final Production97_230 production = new Production97_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}