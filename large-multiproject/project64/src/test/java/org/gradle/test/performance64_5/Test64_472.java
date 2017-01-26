package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_472 {
    private final Production64_472 production = new Production64_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}