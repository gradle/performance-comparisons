package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_36 {
    private final Production64_36 production = new Production64_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}