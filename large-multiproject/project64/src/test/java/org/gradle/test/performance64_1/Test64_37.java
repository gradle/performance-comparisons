package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_37 {
    private final Production64_37 production = new Production64_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}