package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_92 {
    private final Production64_92 production = new Production64_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}