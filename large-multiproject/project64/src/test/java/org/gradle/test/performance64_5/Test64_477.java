package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_477 {
    private final Production64_477 production = new Production64_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}