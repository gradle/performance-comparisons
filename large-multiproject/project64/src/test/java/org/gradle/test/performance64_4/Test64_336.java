package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_336 {
    private final Production64_336 production = new Production64_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}