package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_4 {
    private final Production64_4 production = new Production64_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}