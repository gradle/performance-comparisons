package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_253 {
    private final Production60_253 production = new Production60_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}