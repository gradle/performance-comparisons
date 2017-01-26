package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_208 {
    private final Production64_208 production = new Production64_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}