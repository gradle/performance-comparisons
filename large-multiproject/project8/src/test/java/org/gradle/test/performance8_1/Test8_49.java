package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_49 {
    private final Production8_49 production = new Production8_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}