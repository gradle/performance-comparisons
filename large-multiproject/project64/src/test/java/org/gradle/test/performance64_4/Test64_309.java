package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_309 {
    private final Production64_309 production = new Production64_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}