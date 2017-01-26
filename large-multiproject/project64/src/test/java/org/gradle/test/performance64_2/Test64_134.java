package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_134 {
    private final Production64_134 production = new Production64_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}