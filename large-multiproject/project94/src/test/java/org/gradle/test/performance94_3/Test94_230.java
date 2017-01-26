package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_230 {
    private final Production94_230 production = new Production94_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}