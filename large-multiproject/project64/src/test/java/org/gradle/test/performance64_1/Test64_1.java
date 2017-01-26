package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_1 {
    private final Production64_1 production = new Production64_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}