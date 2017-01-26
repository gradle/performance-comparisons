package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_222 {
    private final Production64_222 production = new Production64_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}