package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_445 {
    private final Production20_445 production = new Production20_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}