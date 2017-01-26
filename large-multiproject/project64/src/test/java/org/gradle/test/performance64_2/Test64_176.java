package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_176 {
    private final Production64_176 production = new Production64_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}