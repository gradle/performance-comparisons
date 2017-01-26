package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_69 {
    private final Production64_69 production = new Production64_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}