package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_7 {
    private final Production64_7 production = new Production64_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}