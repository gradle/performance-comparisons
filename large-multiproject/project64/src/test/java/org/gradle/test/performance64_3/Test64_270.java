package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_270 {
    private final Production64_270 production = new Production64_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}