package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_60 {
    private final Production64_60 production = new Production64_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}