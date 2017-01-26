package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_6 {
    private final Production64_6 production = new Production64_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}