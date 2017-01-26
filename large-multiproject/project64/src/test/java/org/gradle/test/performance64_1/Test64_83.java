package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_83 {
    private final Production64_83 production = new Production64_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}