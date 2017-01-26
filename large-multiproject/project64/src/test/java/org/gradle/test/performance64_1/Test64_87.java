package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_87 {
    private final Production64_87 production = new Production64_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}