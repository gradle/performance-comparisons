package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_322 {
    private final Production64_322 production = new Production64_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}