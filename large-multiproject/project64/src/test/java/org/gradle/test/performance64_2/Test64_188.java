package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_188 {
    private final Production64_188 production = new Production64_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}