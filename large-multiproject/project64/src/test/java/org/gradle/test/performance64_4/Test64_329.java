package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_329 {
    private final Production64_329 production = new Production64_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}