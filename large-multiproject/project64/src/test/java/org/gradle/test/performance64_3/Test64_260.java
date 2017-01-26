package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_260 {
    private final Production64_260 production = new Production64_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}