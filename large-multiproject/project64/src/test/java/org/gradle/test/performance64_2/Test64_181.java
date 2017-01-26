package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_181 {
    private final Production64_181 production = new Production64_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}