package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_353 {
    private final Production8_353 production = new Production8_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}