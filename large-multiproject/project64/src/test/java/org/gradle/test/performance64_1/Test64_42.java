package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_42 {
    private final Production64_42 production = new Production64_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}