package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_446 {
    private final Production19_446 production = new Production19_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}