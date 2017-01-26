package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_196 {
    private final Production64_196 production = new Production64_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}