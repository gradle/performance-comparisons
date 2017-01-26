package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_230 {
    private final Production73_230 production = new Production73_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}