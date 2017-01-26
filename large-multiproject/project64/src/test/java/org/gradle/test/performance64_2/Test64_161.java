package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_161 {
    private final Production64_161 production = new Production64_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}