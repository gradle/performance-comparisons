package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_230 {
    private final Production2_230 production = new Production2_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}