package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_182 {
    private final Production64_182 production = new Production64_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}