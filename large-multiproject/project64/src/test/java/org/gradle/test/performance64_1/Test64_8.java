package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_8 {
    private final Production64_8 production = new Production64_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}