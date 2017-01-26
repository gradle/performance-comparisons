package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_230 {
    private final Production19_230 production = new Production19_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}