package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_230 {
    private final Production81_230 production = new Production81_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}