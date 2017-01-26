package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_230 {
    private final Production65_230 production = new Production65_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}