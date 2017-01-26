package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_230 {
    private final Production17_230 production = new Production17_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}