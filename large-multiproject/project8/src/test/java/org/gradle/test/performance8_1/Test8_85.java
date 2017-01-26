package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_85 {
    private final Production8_85 production = new Production8_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}