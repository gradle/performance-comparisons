package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_5 {
    private final Production64_5 production = new Production64_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}