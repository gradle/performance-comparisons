package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_445 {
    private final Production37_445 production = new Production37_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}