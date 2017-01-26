package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_230 {
    private final Production45_230 production = new Production45_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}