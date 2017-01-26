package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_186 {
    private final Production64_186 production = new Production64_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}