package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_230 {
    private final Production42_230 production = new Production42_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}