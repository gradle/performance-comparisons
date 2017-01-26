package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_230 {
    private final Production11_230 production = new Production11_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}