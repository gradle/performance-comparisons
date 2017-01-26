package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_310 {
    private final Production64_310 production = new Production64_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}