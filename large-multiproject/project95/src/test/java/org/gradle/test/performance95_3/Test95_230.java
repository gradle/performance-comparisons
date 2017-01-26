package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_230 {
    private final Production95_230 production = new Production95_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}