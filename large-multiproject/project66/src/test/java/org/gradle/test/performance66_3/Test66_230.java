package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_230 {
    private final Production66_230 production = new Production66_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}