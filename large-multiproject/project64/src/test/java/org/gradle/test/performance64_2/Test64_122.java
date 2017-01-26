package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_122 {
    private final Production64_122 production = new Production64_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}