package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_230 {
    private final Production29_230 production = new Production29_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}