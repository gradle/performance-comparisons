package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_446 {
    private final Production29_446 production = new Production29_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}