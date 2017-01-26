package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_230 {
    private final Production36_230 production = new Production36_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}