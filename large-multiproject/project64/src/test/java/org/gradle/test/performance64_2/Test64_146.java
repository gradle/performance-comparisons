package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_146 {
    private final Production64_146 production = new Production64_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}