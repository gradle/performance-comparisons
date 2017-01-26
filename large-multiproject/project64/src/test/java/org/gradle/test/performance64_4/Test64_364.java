package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_364 {
    private final Production64_364 production = new Production64_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}