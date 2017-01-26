package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_16 {
    private final Production64_16 production = new Production64_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}