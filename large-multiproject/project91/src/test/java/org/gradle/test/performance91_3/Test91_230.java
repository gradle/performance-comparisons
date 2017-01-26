package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_230 {
    private final Production91_230 production = new Production91_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}