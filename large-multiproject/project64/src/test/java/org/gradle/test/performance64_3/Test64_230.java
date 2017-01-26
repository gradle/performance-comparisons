package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_230 {
    private final Production64_230 production = new Production64_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}