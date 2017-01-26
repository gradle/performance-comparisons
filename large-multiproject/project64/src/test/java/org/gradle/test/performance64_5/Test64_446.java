package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_446 {
    private final Production64_446 production = new Production64_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}