package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_247 {
    private final Production64_247 production = new Production64_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}